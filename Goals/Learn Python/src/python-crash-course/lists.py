#Chapter 3
bicycles = ['trek','cannondale','redline','specialized']

print(bicycles)
print(bicycles[0].title())
print(bicycles[-1].title())


motorcycles = ['honda','yamaha','suzuki']
print(motorcycles)

motorcycles[0] = 'ducati'
print(motorcycles)

motorcycles = [];

motorcycles.append('honda')
motorcycles.append('yamaha')
motorcycles.append('suzuki')

print(motorcycles)

motorcycles.insert(0,'ducati')

print(motorcycles)

print(motorcycles.pop())
print(motorcycles)
del motorcycles[0]
print(motorcycles)
print(motorcycles.pop(0))
print(motorcycles)
print(motorcycles.remove('yamaha'))


cars  =["bmw" , "audi","toyota","subara"]
cars.sort(reverse = True);
print(cars)
print(sorted(cars))
print(cars)
cars.reverse()
print(cars)
print(len(cars))

#Intentional Error
#print(cars[4])



#Chapter 4

magicians = ['alice','david','caroline']
for magician in magicians:
    print(magician)


for number in range(1,6):
    print(number)


numbers = list(range(2,11,2))
print(numbers)


squares = []
for value in range(1,11) :
    square = value ** 2
    squares.append(square)

print(squares)

digits = range(0,10)
print(min(digits))
print(max(digits))
print(sum(digits))

squares = [value ** 2 for value in range(1,11)]
print(squares)


mill = range(1,1000000)
print(max(mill))
print(min(mill))
print(sum(mill))


cubes = [value ** 3 for value in range(1,10)]
print(cubes)



players = ['charles','martina','micheal','florence','eli']
print(players[-3:])

for player in players[:3] :
    print(player.title())


my_foods = ['pizza','falafel','carrot cake']

#Setting friend_foods = my_foods
#doesn't work because python set friend_foods refrence not value its value

friend_foods = my_foods[:]
friend_foods[0] = "butter"
print(my_foods)
print(friend_foods)



#Tuppel
dimensions = (200,50)

print(dimensions[0])
print(dimensions[1])

#Overwriting (aka modifiying)
dimensions = (300,30)
print(dimensions)

