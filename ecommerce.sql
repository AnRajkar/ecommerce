create database ecommerce;
use ecommerce;
# table (Customer,Product,Seller,Order(PaymentType+Review),Employee,Cart,Wishlist,PaymentDetails,Parnment Address,Delivery Address)

#In customers table(T1):- C1.First name(firstname)varchar(255),C2.Last name(lastname)varchar(255),C3.Phone no(phno)varchar,C4.Email(email)varchar,
#*C5.Customer id(customerId)int*,C6.Password(password)varchar,C7.Dob(dob)date,C8.Gender(gender)varchar
create table customers(
customerId int primary key auto_increment,
firstname varchar(255),
lastname varchar(255),
phno varchar(10),
email varchar(255),
pwd varchar(255),
dob date,
gender varchar(255));
desc customers;

#In sellers table:(T3):-*C1.seller id(sellerId)int*,C2.seller name(sellername)varchar,C3.interprise name(enterprisename)varchar,C4.email(email)varchar,C5.phone no(phno)varchar,
#C6.address(address)varchar(255)
create table sellers(
sellerId int primary key auto_increment,
sellername varchar(255),
enterprisename varchar(255),
email varchar(255),
phno varchar(10),
address varchar(255));
desc sellers;

#In products table(T2):- *C1.Product id(productId)int*,C2.Product name(productname)varchar,C3.Product price(productprice)int,C4.Product category(productcategory)varchar,
#C5.Product quantity(quantity)int,C6.Product details(productdetails)varchar(255),C7.Product image(productimage)varchar(255),C8.seller id(sellerId)int foregin key
create table products(
productId int primary key auto_increment,
productname varchar(255),
productprice int,
productcategory varchar(255),
productquantity int,
productdetails varchar(255),
productimage varchar(255),
sellerId int,
foreign key(sellerId) references sellers(sellerId));
desc products;

#In orders table(T4):-*C1.order id(orderId)int*,C2.customer id(customerId)int,C3.product id(productId)int,C4.quantity(quantity)int,C5.date of order(orderdate)date,
#C6.date of delivery(deliverydate)int,C7.payment type(paymenttype)varchar,C8.delivery address id(deliveryaddressId)int,C9.review(review)varchar
create table orders(
orderId int primary key auto_increment,
customerId int,
productId int, 
quantity int,
orderdate date,
deliverydate date,
paymenttype varchar(255),
deliveryaddressId int,
review varchar(255),
foreign key(customerId) references customers(customerId),
foreign key(productId) references products(productId),
foreign key(deliveryaddressId) references delivery_address(deliveryaddressId));
desc orders;

#In cart table(T7):-*C1.customerId int,C2.productId int*
create table cart(
customerId int,
productId int,
primary key (customerId,productId),
foreign key (customerId) references customers(customerId),
foreign key (productId) references products(productId));
desc cart;

#In wishlist(T8):-*C1.customerId int,C2.productId int*
create table wishlist(
customerId int,
productId int,
primary key (customerId,productId),
foreign key (customerId) references customers(customerId),
foreign key (productId) references products(productId));
desc wishlist;

#In Parnment_Address(T5):-C1.Address line1(line1)varchar,C2.city(city)varchar,C3.distic name(district)varchar,C4.state name(state)varchar,C5.pin code(pincode)varchar,
#C6.landmark(landmark)varchar,*C7.permanentaddressId int*,C8.customerId int
create table permanent_address(
permanentaddressId int primary key auto_increment,
customerId int,
line1 varchar(255),
city varchar(255),
district varchar(255),
state varchar(255),
pincode varchar(255),
landmark varchar(255),
foreign key(customerId) references customers(customerId));
desc permanent_address;

#In Delivery_Address(T6):-C1.Address line1(line1)varchar,C2.city(city)varchar,C3.distic name(district)varchar,C4.state name(state)varchar,C5.pin code(pincode)varchar,
#C6.landmark(landmark)varchar,*C7.deliveryaddressId int*,C8.customerId int
create table delivery_address(
deliveryaddressId int primary key auto_increment, 
customerId int,
line1 varchar(255),
city varchar(255),
district varchar(255),
state varchar(255),
pincode varchar(255),
landmark varchar(255),
phno varchar(10),
foreign key(customerId) references customers(customerId));
desc delivery_address;

#In payment_details tables(T9):-*paymentdetailsId int*,customerId int,card number(cardnumber)varchar,card type(cardtype)varchar,expiry date(expirydate)date,
#name on card(cardholdername)varchar,Upi id(uipId) varchar
create table payment_details(
paymentdetailsId int primary key auto_increment,
customerId int,
cardnumber varchar(255),
cardtype varchar(255),
expirydate date,
cardholdername varchar(255),
upiId varchar(255),
foreign key(customerId) references customers(customerId));
desc payment_details;

#In employees table(T10):-