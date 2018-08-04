current_number = 1
while current_number <= 5:
	print(current_number)
	current_number+=1



#message = ""
#while message != 'quit':
#	message = input("Enter quit to exit or something else to repeat: ")
#	print(message)


uncofirmed_users = ['alice','brian','candace']
confirmed_users = []


while uncofirmed_users:
	current_user = uncofirmed_users.pop()
	print("Verifying user:" +current_user.title())
	confirmed_users.append(current_user)


print("\nThe following users have been confirmed")
for confirmed in confirmed_users:
	print(confirmed.title())