def greet_user(user):
	"""Displays a simple greeting"""
	print("Hello, "+user.title()+" !")


greet_user("Me")


def build_person(first_name,last_name,age = '') :
	"""Return a dictionary of information about a person."""
	person = { 'first' : first_name, 'last' : last_name}
	if age:
		person['age'] = age
	return person



def removeA(list):
	list.remove('a')

def make_pizza(*toppings):
	print(toppings)


def build_profile(first,last,**user_info):
	profile = {}
	profile['first'] = first
	profile['last']  = last
	for k,v in user_info.items():
		profile[k] = v
	return profile

print(build_person("jimi","hendrix",age = 32))



list = ['a','b','c']

print(list)
removeA(list[:])
print(list)

make_pizza("pepperino","green peppers","extra chese")


print(build_profile("albert","einstien",location = 'princeton',field = 'physics'))