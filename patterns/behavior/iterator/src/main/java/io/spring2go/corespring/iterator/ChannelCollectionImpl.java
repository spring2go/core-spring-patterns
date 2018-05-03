package io.spring2go.corespring.iterator;

import java.util.ArrayList;
import java.util.List;

// ConcreteAggregate
public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channelList;
	
	public ChannelCollectionImpl() {
		channelList = new ArrayList<>();
	}
	
	@Override
	public void addChannel(Channel c) {
		this.channelList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		this.channelList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, this.channelList);
	}
	
	// ConcreteIterator
	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;
		
		public ChannelIteratorImpl(ChannelTypeEnum type, 
				List<Channel> channelList) {
			this.type = type;
			this.channels = channelList;
		}
		
		@Override
		public boolean hasNext() {
			while (position < channels.size()) {
				Channel c = channels.get(position);
				if (c.getType().equals(type) || 
						type.equals(ChannelTypeEnum.ALL)) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}
		
		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}
	}

}
