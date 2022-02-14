package com.employeewagecal;

import java.util.Random;

public class EmployeeWageComputation {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMPLOYEE_RATE_PER_HOUR = 20;

	public static int empCheckWage() {
		int empWorkingHours = 0;
		Random rand = new Random();
		int empCheck = rand.nextInt(3);

		switch (empCheck) {
		case IS_FULL_TIME:
			empWorkingHours = 8;
			break;

		case IS_PART_TIME:
			empWorkingHours = 4;
			break;

		default:
			empWorkingHours = 0;
			break;

		}
		return empWorkingHours;
	}

	public static int empWagePerDayStatus(int empWorkingHours) {
		int empWagePerDay = empWorkingHours * EMPLOYEE_RATE_PER_HOUR;
		return empWagePerDay;
	}

	public static void main(String[] args) {
		int empWorkingHours;
		int empWagePerDay;
		empWorkingHours = empCheckWage();
		empWagePerDay = empWagePerDayStatus(empWorkingHours);
		System.out.println("Employee Wage per day: " + empWagePerDay);

	}

}
