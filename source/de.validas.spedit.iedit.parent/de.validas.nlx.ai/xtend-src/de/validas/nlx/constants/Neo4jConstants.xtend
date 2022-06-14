package de.validas.nlx.constants

import de.validas.nlx.util.PluginUtils

class Neo4jConstants {
	
	//TODO: 14.03.22 consider to protect, y to extract in a more consealed constants class with package visibility ------>
	public static val DB_URI = "bolt://localhost:7687";
	public static val String DB_USER = "neo4j";
	public static val String DB_PASS = "test";		//<------------
	
	public static val _NODE 			= getString("_NODE"); 				//"n";
	public static val _NAME 			= getString("_NAME");				//"name";
	public static val _LINK 			= getString("_LINK");			 	//"link";
	public static val _TARGET 			= getString("_TARGET");				//"target";
	public static val _SOURCE 			= getString("_SOURCE");				//"source"
	public static val _ATTR_NAME 		= getString("_ATTR_NAME");			//"name";
	public static val _ID 				= getString("_ID");					//"ID";
	public static val _VALUE 			= getString("_VALUE");				//value
	
	public static val ARROW_ 			= getString("ARROW_");				//"->"
	public static val FIRST_ 			= getString("FIRST_");				//"first"
	public static val SECOND_ 			= getString("SECOND_");				//"second"
	
	public static val START_ 			= getString("START_");				//"start"
	public static val END_ 				= getString("END_");				//"end"
	
	public static val _LINK2 			= getString("_LINK2");				//"link2"
	public static val _NODE2 			= getString("_NODE2");				//"node2"
	public static val _A 				= getString("_A");					//"a" 
	public static val _B 				= getString("_B");					//"b"
	public static val _E 				= getString("_E");					//"e"
	public static val _F				= getString("_F");					// f
	public static val _G				= getString("_G");					// g
	public static val _H				= getString("_H");					// h
	public static val _I 				= getString("_I");					//"i"
	public static val _IT				= getString("_IT");					// it
	public static val _CL 				= getString("_CL");					//"cl"
	public static val _LS				= getString("_LS");					//"ls"
	public static val _T	 			= getString("_T");					//"t";
	public static val _S 				= getString("_S");					//"s"
	public static val _SC				= getString("_SC");					//"sc"
	public static val _L	 			= getString("_L");					//"l";
	public static val _L2 				= getString("_L2");					//"l2"
	public static val _N	 			= getString("_N");					//"n";
	public static val _N2 				= getString("_N2");					//"n2"
	public static val _R 				= getString("_R");					//"r"
	public static val _P 				= getString("_P"); 					//"p"
//	public static val _EXCLUDES 		= getString("_EXCLUDES");			//excludes
	public static val _LK 				= getString("_LK"); 				//"lk"
	public static val _LI 				= getString("_LI"); 				//"li"
	public static val _LL 				= getString("_LL"); 				//"ll
	public static val _LA 				= getString("_LA"); 				//"la"
	public static val _ND 				= getString("_ND"); 				//"nd"
	public static val _NI 				= getString("_NI"); 				//"ni"
	public static val _NL 				= getString("_NL"); 				//"nl"
	public static val _NA 				= getString("_NA"); 				//"na"
	public static val _X				= getString("_X");					// x
	public static val _HIT 				= getString("_HIT");				//"hit"
	public static val _ATTR 			= getString("_ATTR"); 				//"attr"
	public static val _ATTRS 			= getString("_ATTRS"); 				//"attrs"
	public static val _INDEX			= getString("_INDEX");				// index
	public static val _OVER_COMMA		= getString("_OVER_COMMA");			//"overKomma"
	public static val CLUSTER_FAMILY_	= getString("CLUSTER_FAMILY_");		//"ClusterFamily"
	public static val ALL_CLUSTERS_		= getString("ALL_CLUSTERS_");		//"allClusters"
	public static val CLUSTER_TYPE_		= getString("CLUSTER_TYPE_");		//"ClusterType"
	
	public static val _MID 				= getString("_MID");					//mid
	public static val _IN_BOX 			= getString("_IN_BOX");				//inBox
	public static val _OUT_BOX 			= getString("_OUT_BOX");				//outBox
	
	private static def getString(String key) {
		PluginUtils.INSTANCE.getString(key).trim();
	}
}