import axios from 'axios';
import React, { useEffect, useState } from 'react';

const VacationListComponent = () => {
    const [sessionEmp, setSessionEmp] = useState(null);
    const [dayOff, setDayOff] = useState(null);

    useEffect(() => {
        const sessionUser = sessionStorage.getItem('user');
        if (sessionUser) {
            const parsedUser = JSON.parse(sessionUser);
            setSessionEmp(parsedUser.empcode);
        }
    }, []);

    useEffect(() => {
        if (!sessionEmp) return;

        const getDayOff = async (empCode) => {
            try {
                const response = await axios.get(`http://localhost:8787/api/dayOff/${empCode}`);
                setDayOff(response.data);
            } catch (error) {
                alert("연차 조회 실패", error);
            }
        };

        getDayOff(sessionEmp);
    }, [sessionEmp]);

    // sessionEmp와 dayOff가 모두 준비될 때만 렌더링
    if (!sessionEmp || !dayOff) {
        return null; // 로딩 중이거나 데이터가 없을 때는 아무것도 렌더링하지 않음
    }

    return (
        <div>
            <div className="container" style={{ marginTop: 30 }}>
                <br />
                <h4>나의 연차 관리</h4>
                <table className="table table-bordered" style={{ maxWidth: 600 }}>
                    <thead>
                        <tr>
                            <th>총 연차 개수</th>
                            <th>사용 가능 연차</th>
                            <th>사용한 연차</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>{dayOff.dayOffLeft} 일</td>
                            <td>{dayOff.dayOffLeft - dayOff.dayOffUsed} 일</td>
                            <td>{dayOff.dayOffUsed} 일</td>
                        </tr>
                    </tbody>
                </table>
                
            </div>
        </div>
    );
};

export default VacationListComponent;
