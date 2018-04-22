package io.spring2go.corespring.composite_complex;

import java.util.List;

// Composite
public class Manager extends BaseEmployee {

	private List<IEmployee> teamMembers;

	public Manager(String name, int employeeId, 
			List<Subscription> subscriptions, 
			List<IEmployee> teamMembers) {
		this.name = name;
		this.employeeId = employeeId;
		this.subscriptions = subscriptions;
		this.teamMembers = teamMembers;
	}

	public List<IEmployee> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<IEmployee> teamMembers) {
		this.teamMembers = teamMembers;
	}

	@Override
	public double getCost() {
		double subsCost = 0.0;
		if (subscriptions != null) {
			subsCost = subscriptions.stream().mapToDouble(s -> s.getCost()).sum();
		}

		double membersCost = 0.0;
		if (teamMembers != null) {
			membersCost = teamMembers.stream().mapToDouble(m -> m.getCost()).sum();
		}

		return subsCost + membersCost;
	}

	@Override
	public int getSubscriptionCount(SubscriptionType type) {
		int subCount = 0;
		if (subscriptions != null) {
			subCount = (int) subscriptions.stream().filter(s -> s.getsType() == type).count();
		}

		int membersSubCount = 0;
		if (teamMembers != null) {
			for (IEmployee member: teamMembers) {
				List<Subscription> subs = member.getSubscriptions();
				if (subs != null) {
					for(Subscription sub : subs) {
						if (sub.getsType() == type) {
							membersSubCount++;
						}
					}
				}
			}
		}

		return subCount + membersSubCount;
	}

}
