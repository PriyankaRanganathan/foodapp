--DROP TABLE IF EXISTS userInfo;

--CREATE TABLE userInfo (
 -- userId INT  PRIMARY KEY,
 -- userName VARCHAR(250) NOT NULL,
--  getDeliveryAddress VARCHAR(250) NOT NULL,
 -- deliveryPincode VARCHAR(250) NOT NULL
--);

INSERT INTO User_Info (user_Id, user_Name, phone_No,delivery_Address,delivery_Pincode) VALUES
  ('432', 'Priya', '9357837058','Coimbatore','641232'),
  ('532', 'Dev', '8294737501','Chennai','641290'),
  ('123', 'Sona', '1198789277','Pollachi','643814');

  INSERT INTO Restaurant (restaurant_Id, restaurant_Name, restaurant_Rating,location) VALUES
    ('23', 'Haven Sampoorna', '4','Coimbatore'),
    ('43', 'Benjarong', '5','Chennai'),
    ('12', 'Seasonal Tastes', '3','Pollachi'),
    ('76', 'Dakshin', '4','Coimbatore'),
    ('31', 'The Marina', '3','Pollachi'),
    ('78', 'Blackpearl', '5','Chennai');


    INSERT INTO food_item (Item_Id, Item_Name, Item_Rate) VALUES
        ('65', 'Oats Idli', '80'),
        ('11', 'Masal Pav', '55'),
        ('43', 'Masala Dosa', '150'),
        ('87', 'Namkeen seviyaan', '70'),
        ('24', 'Poha', '39'),
        ('25', 'Bread Pakora', '50');

        --INSERT INTO orders (Order_Id, Order_Number, Order_Status,Order_Quantity,Order_Total) VALUES
              --  ('290', '2436576', ' ','3','209'),
               -- ('234', '354668', ' ','2','2436576'),
               -- ('664', '24365879', ' ','1','2436576'),
              --  ('113', '7956343', ' ','5','2436576'),
              --  ('876', '3446587', ' ','1','2436576'),
              --  ('963', '3465345', ' ','7,'2436576');