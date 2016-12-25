CREATE TABLE `krisproj`.`timecard` (
  `id` INT NOT NULL,
  `empID` VARCHAR(45) NOT NULL,
  `task` VARCHAR(45) NOT NULL,
  `efforts` INT NOT NULL,
  PRIMARY KEY (`id`));


insert into timecard values (1,'100', 'coding', 8);
insert into timecard values (2,'200', 'testing', 8);

CREATE TABLE `angeraslearn`.`efforts` (
  `id` INT NOT NULL,
  `eID` VARCHAR(45) NOT NULL,
  `activity` VARCHAR(45) NOT NULL,
  `timespent` INT NOT NULL,
  PRIMARY KEY (`id`));