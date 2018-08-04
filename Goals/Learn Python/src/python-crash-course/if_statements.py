cars = ['audi','bmw','sabura','toyota']

for car in cars:
	if car == 'bmw':
		print(car.upper())
	else:
		print(car.title())


if 'tesl' not in cars:
	print('teslta is not present in cars list')


age = 12

if age < 12:
	print("Your admission cost is $0.")
elif age < 18:
	print("Your admission cost is $5.")
else:
	print("Your admission cost is $10.")


menu = [ 'pizza','veg burger','chicken burger','fries','egg']

orders = [ ['pizza','veg burger','mashroom' ], ['chicken burger','ommelete'] ,[] ]

for orderList in orders:
	if orderList:
		for item in orderList:
			if item not in menu:
				print("Sorry " + item + " is not available here.")
	else:
		print("Empty orders list")