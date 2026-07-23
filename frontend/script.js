document.addEventListener("DOMContentLoaded", function () {

    const searchInput = document.getElementById("staffSearch");

    if(searchInput){

        searchInput.addEventListener("keyup", function(){

            let filter = searchInput.value.toLowerCase();

            let rows = document.querySelectorAll(".data-table tbody tr");

            rows.forEach(function(row){

                let text = row.textContent.toLowerCase();

                if(text.includes(filter)){
                    row.style.display = "";
                }else{
                    row.style.display = "none";
                }

            });

        });

    }

});


document.addEventListener("DOMContentLoaded", async function () {

    const doctorTableBody = document.getElementById("doctorTableBody");

    if (doctorTableBody) {

        try {

            const response = await fetch("http://localhost:8080/doctors");
            const doctors = await response.json();

            let rows = "";

            doctors.forEach(doctor => {

                rows += `
                    <tr>
                        <td>${doctor.id}</td>
                        <td>${doctor.doctorName}</td>
                        <td>${doctor.specialization}</td>
                        <td>${doctor.experience}</td>
                        <td>${doctor.designation}</td>
                        <td>${doctor.phone}</td>
                    </tr>
                `;

            });

            doctorTableBody.innerHTML = rows;

        } catch (error) {
            console.error("Error loading doctors:", error);
        }

    }

});

document.addEventListener("DOMContentLoaded", async function () {

    const patientTableBody = document.getElementById("patientTableBody");

    if (patientTableBody) {

        const response = await fetch("http://localhost:8080/api/patients");
        const patients = await response.json();

        let rows = "";

        patients.forEach(patient => {

            rows += `
            <tr>
                <td>${patient.id}</td>
                <td>${patient.patientName}</td>
                <td>${patient.age}</td>
                <td>${patient.gender}</td>
                <td>${patient.bloodGroup}</td>
                <td>${patient.disease}</td>
                <td>${patient.doctorName}</td>
                <td>${patient.roomNo}</td>
                <td>${patient.phone}</td>
                <td>${patient.address}</td>
                <td>${patient.admissionDate}</td>
                <td>${patient.status}</td>
            </tr>`;
        });

        patientTableBody.innerHTML = rows;
    }
});


document.addEventListener("DOMContentLoaded", async function () {

    const nurseTableBody = document.getElementById("nurseTableBody");

    if (nurseTableBody) {

        const response = await fetch("http://localhost:8080/nurses");
        const nurses = await response.json();

        let rows = "";

        nurses.forEach(nurse => {

            rows += `
<tr>
    <td>${nurse.nurseId}</td>
    <td>${nurse.name}</td>
    <td>${nurse.department}</td>
    <td>${nurse.shift}</td>
    <td>${nurse.experience}</td>
    <td>${nurse.phone}</td>
    <td>${nurse.status}</td>
</tr>
`;
        });

        nurseTableBody.innerHTML = rows;
    }
});


document.addEventListener("DOMContentLoaded", async function () {

    const receptionTableBody = document.getElementById("receptionTableBody");

    if (receptionTableBody) {

        try {

            const response = await fetch("http://localhost:8080/reception");
            const receptions = await response.json();

            let rows = "";

            receptions.forEach(reception => {

                rows += `
                    <tr>
                        <td>${reception.staffId}</td>
                        <td>${reception.name}</td>
                        <td>${reception.role}</td>
                        <td>${reception.shift}</td>
                        <td>${reception.experience}</td>
                        <td>${reception.phone}</td>
                        <td>${reception.status}</td>
                    </tr>
                `;

            });

            receptionTableBody.innerHTML = rows;

        } catch (error) {

            console.error("Error loading reception data:", error);

        }

    }

});


document.addEventListener("DOMContentLoaded", async () => {

    const laboratoryTableBody = document.getElementById("laboratoryTableBody");

    if (!laboratoryTableBody) {
        console.log("laboratoryTableBody not found");
        return;
    }

    try {

        const response = await fetch("http://localhost:8080/laboratory");

        if (!response.ok) {
            throw new Error("Failed to fetch laboratory data");
        }

        const laboratories = await response.json();

        laboratoryTableBody.innerHTML = "";

        laboratories.forEach(lab => {

            laboratoryTableBody.innerHTML += `
                <tr>
                    <td>${lab.labId}</td>
                    <td>${lab.name}</td>
                    <td>${lab.role}</td>
                    <td>${lab.specialization}</td>
                    <td>${lab.shift}</td>
                    <td>${lab.experience}</td>
                    <td>${lab.phone}</td>
                    <td>${lab.status}</td>
                </tr>
            `;
        });

    } catch (error) {

        console.error(error);

        laboratoryTableBody.innerHTML = `
            <tr>
                <td colspan="8">Failed to load laboratory data</td>
            </tr>
        `;
    }

});


document.addEventListener("DOMContentLoaded", async function () {

    const ambulanceTableBody = document.getElementById("ambulanceTableBody");

    if (ambulanceTableBody) {

        try {

            const response = await fetch("http://localhost:8080/ambulances");
            const ambulances = await response.json();

            let rows = "";

            ambulances.forEach(ambulance => {

                rows += `
                    <tr>
                        <td>${ambulance.ambulanceId}</td>
                        <td>${ambulance.vehicleNumber}</td>
                        <td>${ambulance.driverName}</td>
                        <td>${ambulance.contactNumber}</td>
                        <td>${ambulance.type}</td>
                        <td>${ambulance.currentLocation}</td>
                        <td>${ambulance.status}</td>
                    </tr>
                `;

            });

            ambulanceTableBody.innerHTML = rows;

        } catch (error) {

            console.error("Error loading ambulance data:", error);

        }

    }

});



fetch("http://localhost:8080/medicines")
.then(response => response.json())
.then(data => {

    const medicineTableBody =
    document.getElementById("medicineTableBody");

    if (!medicineTableBody) {
        console.error("medicineTableBody not found");
        return;
    }

    medicineTableBody.innerHTML = "";

    data.forEach(medicine => {

        medicineTableBody.innerHTML += `
        <tr>
            <td>${medicine.medicineId || "-"}</td>
            <td>${medicine.medicineName || "-"}</td>
            <td>${medicine.category || "-"}</td>
            <td>${medicine.batchNo || "-"}</td>
            <td>${medicine.stock || "-"}</td>
            <td>₹${medicine.price || "-"}</td>
            <td>${medicine.expiryDate || "-"}</td>
            <td>${medicine.manufacturer || "-"}</td>
            <td>${medicine.status || "-"}</td>
        </tr>
        `;
    });

})
.catch(error => {

    console.error(error);

    const medicineTableBody =
    document.getElementById("medicineTableBody");

    if (medicineTableBody) {

        medicineTableBody.innerHTML = `
        <tr>
            <td colspan="9">
                Failed to load medicine data
            </td>
        </tr>
        `;
    }
});


document.addEventListener("DOMContentLoaded", async function () {

    const housekeepingTableBody = document.getElementById("housekeepingTableBody");

    if (housekeepingTableBody) {

        try {

            const response = await fetch("http://localhost:8080/housekeeping");
            const housekeeping = await response.json();

            let rows = "";

            housekeeping.forEach(emp => {

                rows += `
                    <tr>
                        <td>${emp.employeeId}</td>
                        <td>${emp.name}</td>
                        <td>${emp.designation}</td>
                        <td>${emp.shift}</td>
                        <td>${emp.experience}</td>
                        <td>${emp.phone}</td>
                        <td>${emp.status}</td>
                    </tr>
                `;

            });

            housekeepingTableBody.innerHTML = rows;

        } catch (error) {

            console.error("Error loading housekeeping data:", error);

        }

    }

});


document.addEventListener("DOMContentLoaded", () => {

    const tableBody = document.getElementById("hrTableBody");

    if (!tableBody) {
        return;
    }

    fetch("http://localhost:8080/hr")
        .then(response => response.json())
        .then(data => {

            tableBody.innerHTML = "";

            data.forEach(hr => {

                tableBody.innerHTML += `
                <tr>
                    <td>${hr.employeeId || "-"}</td>
                    <td>${hr.name || "-"}</td>
                    <td>${hr.designation || "-"}</td>
                    <td>${hr.department || "-"}</td>
                    <td>${hr.experience || "-"}</td>
                    <td>${hr.phone || "-"}</td>
                    <td>${hr.status || "-"}</td>
                </tr>
                `;
            });

        })
        .catch(error => {

            console.error("Error loading HR data:", error);

            tableBody.innerHTML = `
            <tr>
                <td colspan="7">
                    Failed to load HR data
                </td>
            </tr>
            `;
        });

});



document.addEventListener("DOMContentLoaded", () => {

    const tableBody = document.getElementById("financeTableBody");

    if (!tableBody) {
        return;
    }

    fetch("http://localhost:8080/finance")
        .then(response => response.json())
        .then(data => {

            tableBody.innerHTML = "";

            data.forEach(finance => {

                tableBody.innerHTML += `
                <tr>
                    <td>${finance.employeeId || "-"}</td>
                    <td>${finance.name || "-"}</td>
                    <td>${finance.designation || "-"}</td>
                    <td>${finance.department || "-"}</td>
                    <td>${finance.experience || "-"}</td>
                    <td>${finance.phone || "-"}</td>
                    <td>${finance.status || "-"}</td>
                </tr>
                `;
            });

        })
        .catch(error => {

            console.error("Error loading finance data:", error);

            tableBody.innerHTML = `
            <tr>
                <td colspan="7">
                    Failed to load finance data
                </td>
            </tr>
            `;
        });

});




document.addEventListener("DOMContentLoaded", () => {

    const maintenanceTableBody =
        document.getElementById("maintenanceTableBody");

    if (!maintenanceTableBody) {
        return;
    }

    fetch("http://localhost:8080/maintenance")
        .then(response => response.json())
        .then(data => {

            maintenanceTableBody.innerHTML = "";

            data.forEach(maintenance => {

                maintenanceTableBody.innerHTML += `
                <tr>
                    <td>${maintenance.employeeId || "-"}</td>
                    <td>${maintenance.name || "-"}</td>
                    <td>${maintenance.designation || "-"}</td>
                    <td>${maintenance.department || "-"}</td>
                    <td>${maintenance.experience || "-"}</td>
                    <td>${maintenance.phone || "-"}</td>
                    <td>${maintenance.status || "-"}</td>
                </tr>
                `;
            });

        })
        .catch(error => {

            console.error("Error loading maintenance data:", error);

            maintenanceTableBody.innerHTML = `
            <tr>
                <td colspan="7">
                    Failed to load maintenance data
                </td>
            </tr>
            `;
        });

});




document.addEventListener("DOMContentLoaded", async () => {

    const tableBody = document.getElementById("radiologyTableBody");

    if (!tableBody) {
        console.log("radiologyTableBody not found");
        return;
    }

    try {

        const response = await fetch("http://localhost:8080/radiology");

        if (!response.ok) {
            throw new Error("Failed to fetch radiology data");
        }

        const data = await response.json();

        tableBody.innerHTML = "";

        data.forEach(radiology => {

            tableBody.innerHTML += `
            <tr>
                <td>${radiology.radiologyId || "-"}</td>
                <td>${radiology.name || "-"}</td>
                <td>${radiology.specialization || "-"}</td>
                <td>${radiology.shift || "-"}</td>
                <td>${radiology.experience || "-"}</td>
                <td>${radiology.phone || "-"}</td>
                <td>${radiology.status || "-"}</td>
            </tr>
            `;
        });

    } catch (error) {

        console.error("Radiology Error:", error);

        tableBody.innerHTML = `
        <tr>
            <td colspan="7">Failed to load radiology data</td>
        </tr>`;
    }

});




document.addEventListener("DOMContentLoaded", () => {

    const tableBody = document.getElementById("securityTableBody");

    if (!tableBody) {
        console.error("securityTableBody not found");
        return;
    }

    fetch("http://localhost:8080/security")
    .then(response => response.json())
    .then(data => {

        tableBody.innerHTML = "";

        data.forEach(security => {

            tableBody.innerHTML += `
            <tr>
                <td>${security.employeeId || "-"}</td>
                <td>${security.name || "-"}</td>
                <td>${security.designation || "-"}</td>
                <td>${security.shift || "-"}</td>
                <td>${security.experience || "-"}</td>
                <td>${security.phone || "-"}</td>
                <td>${security.status || "-"}</td>
            </tr>
            `;
        });

    })
    .catch(error => {

        console.error(error);

        tableBody.innerHTML = `
        <tr>
            <td colspan="7">Failed to load security data</td>
        </tr>`;
    });

});




fetch("http://localhost:8080/pharmacystaff")
.then(response => response.json())
.then(data => {

    const tableBody =
    document.getElementById("pharmacyTableBody");

    if (!tableBody) {
        return;
    }

    tableBody.innerHTML = "";

    data.forEach(staff => {

        tableBody.innerHTML += `
        <tr>
            <td>${staff.staffId}</td>
            <td>${staff.name}</td>
            <td>${staff.designation}</td>
            <td>${staff.counterName}</td>
            <td>${staff.shift}</td>
            <td>${staff.phone}</td>
            <td>${staff.status}</td>
        </tr>
        `;
    });

})
.catch(error => {
    console.error(error);
});






document.addEventListener("DOMContentLoaded", async function () {

    const bedTableBody = document.getElementById("bedTableBody");

    if (bedTableBody) {

        const response = await fetch("http://localhost:8080/api/beds");
        const beds = await response.json();

        let rows = "";

        beds.forEach(bed => {

            rows += `
            <tr>
                <td>${bed.bedId}</td>
                <td>${bed.ward}</td>
                <td>${bed.roomNo}</td>
                <td>${bed.bedNo}</td>
                <td>${bed.patientName}</td>
                <td>${bed.doctorName}</td>
                <td>${bed.status}</td>
            </tr>`;
        });

        bedTableBody.innerHTML = rows;
    }

});