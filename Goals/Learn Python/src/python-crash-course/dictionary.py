alien_0 = {}
alien_0['color'] = 'green'
alien_0['points'] = 5

print(alien_0['color'])



user_0 = {
	'username' : 'efermi',
	'first' : 'enirco',
	'last' : 'fermi'
}

for key,value in user_0.items():
	print("\nKey: "+key)
	print("Value: "+value)



alien_1 = { 'color' : 'yellow', 'points' : 10}
alien_2 = { 'color' : 'red', 'points' : 15}

aliens = [ alien_0,alien_1, alien_2 ]

for n in range(30):
	aliens.append({'color' : 'yellow', 'points': 5, 'speed' : 'slow'})

for v in aliens:
	print(v)