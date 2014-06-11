dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost/tidweb"
		    driverClassName = "com.mysql.jdbc.Driver"
		    username = "tidadmin"
		    password = "tidadm123!"
			properties {
				maxActive = 5
				maxIdle = 2
				minIdle = 1
				initialSize = 2
				minEvictableIdleTimeMillis = 10000
				timeBetweenEvictionRunsMillis = 10000
				maxWait = 10000
				validationQuery = "SELECT 1"
			}
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }
    production {
        dataSource {
            dbCreate = "create-drop"
            url = "jdbc:mysql://192.155.247.250:3307/df934d4d3ec1540db8f3bb38b17019140"
			driverClassName = "com.mysql.jdbc.Driver"
			username = "uPdV8YN6n0Qlq"
			password = "pqqdG2kSkAM4i"
			properties {
				maxActive = 10
				maxIdle = 5
				minIdle = 2
				initialSize = 3
				minEvictableIdleTimeMillis = 60000
				timeBetweenEvictionRunsMillis = 60000
				maxWait = 10000
				validationQuery = "SELECT 1"
			}
        }
    }
}
