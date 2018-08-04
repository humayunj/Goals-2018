#import pizza # or  import pizza as p

#pizza.make_pizza(16,"pepperoni")
#pizza.make_pizza(12,"mushrooms",'green peppers','extra chesses')


from pizza import make_pizza as mp
# also from pizza import *
mp(16,"pepperoni")
mp(12,"mushrooms",'green peppers','extra chesses')
