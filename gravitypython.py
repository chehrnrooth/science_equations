gravity_constant = 6.67e-11
acceleration_gravity = 9.81
print "This is a program created by Christian Ehrnrooth to at least try and answer a few physics and chemistry problems that I really didn't want to do as homework."
#choose your field
while True:
	field = raw_input("Choose your field: Physics or Chemistry (answer p for physics, and c for chemistry) ")
	if field == 'p':
		break
	elif field == 'c':
		print "I'm sorry but the chemistry feature is not supported as of yet (line 8) enter 'p'"
		continue
	else:
		print "I'm sorry, I didn't understand, could you repeat that? (press p)"
#which section of physics (gravity)
while True:
	if field == 'p':
		physics_field = raw_input("Which section of physics? (Answer g for gravity): ")
		if physics_field == 'g':
			break
		else:
			print "I'm sorry, I didn't understand, could you repeat that? (press g)"
			continue
	
#force of gravity or orbital time
while True:
	if physics_field == 'g':
		physics_field_sec = raw_input("What section are you trying to find? Answer 'f' for force of gravity and 'o' for orbital time: ")
		if physics_field_sec == 'f': 
			physics_field_sec_validation = raw_input("You selected force of gravity, is this right? 'Y' for yes and 'N' for no: ")
			if physics_field_sec_validation == 'Y':
				break
			else:
				continue
		elif physics_field_sec == 'o':
			print"I'm sorry but orbitals are not supported at this time, check back later"
			continue
#force of gravity
while True:
	if physics_field_sec == 'f':
		print"If one of the variables is missing, type '000'" 
		mass1 = float(input('Enter your first mass: ')) #variables here
		mass2 = float(input('Enter your second mass: '))
		rad = float(input('Enter your radius: '))
		print 'Just to confirm, these are your values: ', 'Mass 1 =', mass1, 'Mass 2 = ', mass2, 'And your radius is =', rad
		print "Are these right? If you have an issue with any of them type '1' for Mass 1, type '2' for Mass '2', type 'rad' for radius, or type 'c' for confirm. If you are missing a value, just type 'Missing'"
		issue_force_of_gravity = raw_input('Which one?: ')
		
		if issue_force_of_gravity == '1' or issue_force_of_gravity == '2' or issue_force_of_gravity == 'rad':
			continue
		elif issue_force_of_gravity == 'c':
			break
		elif issue_force_of_gravity == 'Missing':
			break
	break
while True:
	if issue_force_of_gravity == 'c':
		force_of_gravity = gravity_constant*(mass1*mass2/(rad**2))	
		print 'The force of gravity is:', force_of_gravity		
		break
	elif issue_force_of_gravity == 'Missing':
		input_force_of_gravity = int(input("What's your force of gravity given (this program is going to spit out the mass or radius depending on which you put as '000', be prepared)"))
		if mass1 == 000:
			mass1 = (input_force_of_gravity*(rad**2))/(gravity_constant*mass2)
			print 'Mass1 =', mass1
			break
		elif mass2 == 000:
			mass2 = (input_force_of_gravity*(r**2))/(gravity_constant*mass1)
			print 'Mass2 =', mass2
			break
		elif rad == 000:
			rad = ((gravity_constant*mass1*mass2)/input_force_of_gravity)**(1/2)
			print 'radius =', rad
			break
print 'complete'
