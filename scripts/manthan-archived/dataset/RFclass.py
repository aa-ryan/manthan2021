spark = SparkSession.builder.appName("Indian Crime Dataset")\
.config("spark.some.config.option", "some-value")\
.config("spark.driver.memory", "4g")\
.config("spark.driver.cores", "1")\
.getOrCreate()

