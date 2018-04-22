package io.spring2go.corespring.composite_complex;

import java.util.Arrays;
import java.util.List;

public class CompanyMain {

	public static void main(String[] args) {
		// 创建一些开发者并赋予订购项
		IEmployee emp1 = new Developer("A", 1);
		List<Subscription> subs = Arrays.asList(Util.getIntellijSubscription(), Util.getJProfilierSubscription(),
				Util.getCSDNSubscription(), Util.getTrainingSubscription());
		emp1.setSubscriptions(subs);
		
		IEmployee emp2 = new Developer("B", 2);
		subs = Arrays.asList(Util.getIntellijSubscription(), Util.getJProfilierSubscription());
		emp2.setSubscriptions(subs);
		
		IEmployee emp3 = new Developer("C", 3);
		subs = Arrays.asList(Util.getIntellijSubscription());
		emp3.setSubscriptions(subs);
		
		IEmployee emp4 = new Developer("D", 4);
		subs = Arrays.asList(Util.getIntellijSubscription());
		emp4.setSubscriptions(subs);
		
		IEmployee emp5 = new Developer("E", 5);
		subs = Arrays.asList(Util.getIntellijSubscription());
		emp5.setSubscriptions(subs);
		
		IEmployee emp6 = new Developer("F", 6);
		subs = Arrays.asList(Util.getIntellijSubscription(), Util.getTrainingSubscription());
		emp6.setSubscriptions(subs);
		
		IEmployee emp7 = new Developer("G", 7);
		subs = Arrays.asList(Util.getIntellijSubscription());
		emp7.setSubscriptions(subs);
		
		IEmployee emp8 = new Developer("H", 8);
		subs = Arrays.asList(Util.getIntellijSubscription());
		emp8.setSubscriptions(subs);
		
		IEmployee emp9 = new Developer("I", 9);
		subs = Arrays.asList(Util.getIntellijSubscription());
		emp9.setSubscriptions(subs);
		
		IEmployee emp10 = new Developer("J", 10);
		subs = Arrays.asList(Util.getIntellijSubscription(), Util.getCSDNSubscription());
		emp10.setSubscriptions(subs);
		
		// 获取单个员工的成本细节
		System.out.println("Let's get cost details of single employee");
		Util.printCostDetails(emp1);
		
		// 获取一组员工的成本细节
		List<IEmployee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
		System.out.println("Let's check cost details of list of employees");
		for(IEmployee employee : employees) {
			Util.printCostDetails(employee);
		}
		
		// 设置经理
		subs = Arrays.asList(Util.getIntellijSubscription(), Util.getJProfilierSubscription(),
				Util.getCSDNSubscription(), Util.getTrainingSubscription());
		List<IEmployee> teamMembers = Arrays.asList(emp1, emp2, emp3);
		IEmployee mng1 = new Manager("MA", 11, subs, teamMembers);

		subs = Arrays.asList(Util.getIntellijSubscription());
		teamMembers = Arrays.asList(emp4, emp5, emp6);
		IEmployee mng2 = new Manager("MB", 12, subs, teamMembers);
		
		subs = Arrays.asList(Util.getTrainingSubscription());
		teamMembers = Arrays.asList(emp7, emp8, emp9, emp10);
		IEmployee mng3 = new Manager("MC", 13, subs, teamMembers);
		
		// 获取单个经理的成本细节
		System.out.println("Let's get cost details of single manager");
		Util.printCostDetails(mng1);
		
		// 获取一组经理的成本细节
		System.out.println("Let's check details of list of manager");
		List<IEmployee> managers = Arrays.asList(mng1, mng2, mng3);
		for(IEmployee employee : managers) {
			Util.printCostDetails(employee);
		}
	}

}
