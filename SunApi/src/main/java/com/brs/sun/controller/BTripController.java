package com.brs.sun.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brs.sun.dto.request.BTripRequestDTO;
import com.brs.sun.dto.response.VehicleRentDTO;
import com.brs.sun.model.service.BTripService;
import com.brs.sun.vo.BTripVo;
import com.brs.sun.vo.CoWorkVo;
import com.brs.sun.vo.PagingVo;
import com.brs.sun.vo.VehicleReservationVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BTripController {
	
	private final BTripService service;
	  
	@GetMapping("/btrip/{empCode}")
	public List<BTripVo> getMyBTrip(@PathVariable String empCode){
		
		log.info("getMyBTrip 요청 사원번호 : {}", empCode);
		return service.getMyBTrip(empCode);
	}
	
	@GetMapping("/btripDetail/{btripCode}")
	public BTripVo getOneBTrip(@PathVariable("btripCode") String bTripCode,
	                           @RequestParam String empCode) {
		log.info("getOneBTrip 요청 empCode : {}", empCode);
		log.info("getOneBTrip 요청 bTripCode : {}", bTripCode);
	    return service.getOneBTrip(bTripCode, empCode);
	}
	
	@GetMapping("/vrsvDetail/{btripCode}")
	public List<VehicleReservationVo> getMyVehicleRsv(
			@PathVariable("btripCode") String bTripCode,
            @RequestParam String empCode){
		log.info("getMyVehicleRsv 요청 empCode : {}", empCode);
		log.info("getMyVehicleRsv 요청 bTripCode : {}", bTripCode);
		return service.getMyVehicleRsv(bTripCode, empCode);
	}
	
	@GetMapping("/cowork")
	public PagingVo<CoWorkVo> searchCoWork(
	    @RequestParam(defaultValue = "1") int page,
	    @RequestParam(defaultValue = "5") int countList,
	    @RequestParam(required = false) String cowName,
	    @RequestParam(required = false) String cowAddress) {

	    // 전체 게시글 수 조회
	    int totalCount = service.countCoWork(cowName, cowAddress);

	    // 페이징 정보 생성
	    PagingVo<CoWorkVo> paging = new PagingVo<>(page, countList, totalCount, 10);

	    // 게시글 목록 조회
	    List<CoWorkVo> results = service.searchCoWork((page - 1) * countList + 1, page * countList, cowName, cowAddress);

	    // 게시글 목록을 PagingVo 객체에 설정
	    paging.setContent(results);

	    // 결과 반환
	    return paging;
	}
	
	@GetMapping("/getAllVehicleRsv")
	public PagingVo<VehicleRentDTO> getAllVehicleRsv(
	        @RequestParam(defaultValue = "1") int page,
	        @RequestParam(defaultValue = "50") int countList,
	        @RequestParam(required = false) String startDate,
	        @RequestParam(required = false) String endDate) {

	    log.info("startDate : {}", startDate);
	    log.info("endDate : {}", endDate);

	    // startDate나 endDate가 null 또는 빈 문자열일 경우 null로 처리
	    if (startDate != null && startDate.trim().isEmpty()) {
	        startDate = null;
	    }
	    if (endDate != null && endDate.trim().isEmpty()) {
	        endDate = null;
	    }

	    int totalCount = service.countVehicleRsv(startDate, endDate);
	    PagingVo<VehicleRentDTO> paging = new PagingVo<>(page, countList, totalCount, 10);
	    List<VehicleRentDTO> results = service.getAllVehicleRsv((page - 1) * countList + 1, page * countList, startDate, endDate);
	    paging.setContent(results);

	    return paging;
	}

	
	@GetMapping("/availableVehicle")
	public List<Map<String, Object>> getAvailableVehicles(
		    @RequestParam(required = false) String startDate,
		    @RequestParam(required = false) String endDate){
		log.info("startDate : {}",startDate);
		log.info("endDate : {}",endDate);
		return service.getAvailableVehicles(startDate, endDate);
	}
	
	@PostMapping("/insertBTrip")
	public int insertBTripVRsv(@RequestBody BTripRequestDTO requestDto) {
		log.info("requestDto:{}", requestDto);
	    return service.insertBTripVRsv(requestDto);
	}
	
	@PostMapping("/approveVRent")
	public int updateVehicleRsrvYes(@RequestParam String vrsvCode) {
		log.info("승인한 배차신청서 코드 : {}",vrsvCode);
		return service.updateVehicleRsrvYes(vrsvCode);
	}

	@PostMapping("/rejectVRent")
	public int updateVehicleRsrvNo(@RequestParam String vrsvCode, @RequestParam String vrsvReply) {
		log.info("반려한 배차신청서 코드 : {}",vrsvCode);
		log.info("반려한 배차신청서 반려사유 : {}",vrsvReply);
		return service.updateVehicleRsrvNo(vrsvCode, vrsvReply);
	}
	
	@GetMapping("/vrentDetail/{vrsvCode}")
	public VehicleRentDTO getOneVehicleRsv(@PathVariable("vrsvCode") String vrsvCode) {
		log.info("getOneVehicleRsv 요청 vrsvCode : {}", vrsvCode);
	    return service.getOneVehicleRsv(vrsvCode);
	}

	
	@PostMapping("/reVehicleRsv")
	public void insertReVehicleRsc(@RequestBody Map<String, Object> requestDto) {
		log.info("재입력한 배차 신청서 정보 : {}",requestDto);
	    VehicleRentDTO vehicleRentDTO = VehicleRentDTO.builder()
	            .bTripCode(Integer.parseInt((String) requestDto.get("btripCode")))
	            .vehicleCode(Integer.parseInt((String) requestDto.get("vehicleCode")))
	            .vrsvDetail((String) requestDto.get("vrsvDetail"))
	            .vrsvDate((String) requestDto.get("vrsvDate"))
	            .build();

	    service.insertReVehicleRsc(vehicleRentDTO);
	}

}
