-- Database: DAMtest

-- DROP DATABASE IF EXISTS "DAMtest";

CREATE DATABASE "DAMtest"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'C'
    LC_CTYPE = 'C'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

-- Tabelul User
CREATE TABLE Users (
    userId SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    role VARCHAR(255),
    department VARCHAR(255)
);

-- Tabelul Equipment
CREATE TABLE Equipment (
    equipmentId SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    status VARCHAR(50),
    acquisitionDate DATE,
    price DECIMAL(10, 2),
    location VARCHAR(255)
);

-- Tabelul Acquisition
CREATE TABLE Acquisition (
    acquisitionId SERIAL PRIMARY KEY,
    acquisitionDate DATE NOT NULL,
    totalAmount DECIMAL(10, 2),
    equipmentId INT NOT NULL,
    FOREIGN KEY (equipmentId) REFERENCES Equipment(equipmentId)
);

-- Tabelul Maintenance
CREATE TABLE Maintenance (
    maintenanceId SERIAL PRIMARY KEY,
    equipmentId INT NOT NULL,
    maintenanceDate DATE NOT NULL,
    maintenanceType VARCHAR(255),
    description TEXT,
    FOREIGN KEY (equipmentId) REFERENCES Equipment(equipmentId)
);

-- Tabelul MaintenanceSchedule
CREATE TABLE MaintenanceSchedule (
    scheduleId SERIAL PRIMARY KEY,
    equipmentId INT NOT NULL,
    maintenanceId INT NOT NULL,
    FOREIGN KEY (equipmentId) REFERENCES Equipment(equipmentId),
    FOREIGN KEY (maintenanceId) REFERENCES Maintenance(maintenanceId)
);

-- Tabelul RepairRequest
CREATE TABLE RepairRequest (
    requestId SERIAL PRIMARY KEY,
    equipmentId INT NOT NULL,
    issueDescription TEXT,
    requestDate DATE NOT NULL,
    status VARCHAR(50),
    technicianId INT,
    FOREIGN KEY (equipmentId) REFERENCES Equipment(equipmentId),
    FOREIGN KEY (technicianId) REFERENCES Users(userId)
);

-- Tabelul RepairActivities
CREATE TABLE RepairActivities (
    activityId SERIAL PRIMARY KEY,
    requestId INT NOT NULL,
    activityDescription TEXT,
    FOREIGN KEY (requestId) REFERENCES RepairRequest(requestId)
);

-- Tabelul Report
CREATE TABLE Report (
    reportId SERIAL PRIMARY KEY,
    reportType VARCHAR(255),
    generatedDate DATE NOT NULL,
    content TEXT
);

-- Tabelul Reservation
CREATE TABLE Reservation (
    reservationId SERIAL PRIMARY KEY,
    equipmentId INT NOT NULL,
    userId INT NOT NULL,
    reservationDate DATE NOT NULL,
    returnDate DATE,
    FOREIGN KEY (equipmentId) REFERENCES Equipment(equipmentId),
    FOREIGN KEY (userId) REFERENCES Users(userId)
);

-- Tabelul Inventory
CREATE TABLE Inventory (
    inventoryId SERIAL PRIMARY KEY,
    equipmentId INT NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY (equipmentId) REFERENCES Equipment(equipmentId)
);
