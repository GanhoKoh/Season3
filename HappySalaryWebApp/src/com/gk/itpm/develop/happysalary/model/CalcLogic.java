package com.gk.itpm.develop.happysalary.model;

public class CalcLogic {

	public static boolean validateEngingeerRank(String engineerRank) {
		if("A".compareToIgnoreCase(engineerRank) == 0
			||"B".compareToIgnoreCase(engineerRank) == 0
			||"C".compareToIgnoreCase(engineerRank) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validateCost(String cost) {
		try {
			Integer.parseInt(cost);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static int calcuSalary(String engineerRank, int cost) {
		if("A".compareToIgnoreCase(engineerRank) == 0) {
			return (int) (cost * 0.6);
		} else if ("B".compareToIgnoreCase(engineerRank) == 0) {
			return (int) (cost * 0.55);
		} else {
			return (int) (cost * 0.4);
		}
	}

}
