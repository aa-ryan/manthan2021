from statistics import mode, mean, median
from pandas import *

data = read_csv("dataset.csv")

crime_count = data['Count'].tolist()

print(mean(crime_count))
print(median(crime_count))
print(mode(crime_count))
