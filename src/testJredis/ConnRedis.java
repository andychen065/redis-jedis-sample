package testJredis;

import redis.clients.jedis.Jedis;

public class ConnRedis {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		//jedis.set("foo", "bar111");
		String value = jedis.get("foo");
		System.out.println("value = " + value);
		
		/*
		 Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		//Jedis Cluster will attempt to discover cluster nodes automatically
		jedisClusterNodes.add(new HostAndPort("127.0.0.1", 7379));
		JedisCluster jc = new JedisCluster(jedisClusterNodes);
		jc.set("foo", "bar");
		String value = jc.get("foo"); 
		 * */
	}

}
