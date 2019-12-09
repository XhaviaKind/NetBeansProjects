package Model;

// Create a database butanon;

// Create table users (ID int AUTO_INCREMENT, Firstname varchar(50) NOT NULL, Lastname varchar(50) NOT NULL, Username varchar(50) NOT NULL, Password varchar(50) NOT NULL, Role varchar(500) NOT NULL, PRIMARY KEY(ID));

// Create table medicine (ID int AUTO_INCREMENT, Med_for varchar(50) NOT NULL, GenericName varchar(50) NOT NULL, BrandName varchar(50) NOT NULL, Price double NOT NULL, Quantity int NOT NULL, Description varchar(500) NOT NULL, PRIMARY KEY(ID));

// create table purchase_history (ID int AUTO_INCREMENT,GenericName varchar(50) NOT NULL ,BrandName varchar(60) NOT NULL,Price double NOT NULL, Quantity INT NOT NULL, Description VARCHAR(50) NOT NULL, Total_Amount DOUBLE NOT NULL, PRIMARY KEY(ID));

// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Allergy", "Cetirizine", "Zyrtec Allergy", 89.25, 10, "Syrup for children");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Allergy", "Acrivastine", "Semprex-D", 50, 10, "Capsules");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Allergy", "Antihistamine", "Clemastine", 52.75, 10, "Allergic rhinitis");

// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Body Pain", "Ibuprofen", "Advil", 149.25, 10, "Advil Suspension 100 mg/5ml 60ml");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Body Pain", "Naproxen", "Naproxen", 51.75, 10, "Naproxen Sodium");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Body Pain", "RiteMed", "Cilostazol", 160, 10, "Pletaal 100mg Tablet");

// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Cough", "Ambrolex", "Ambrolex", 19.25, 10, "Ambrolex 15mg/5ml syrup 120ml");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Cough", "RiteMed", "Ambroxol", 18, 10, "Ambroxol 30mg Tablet");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Cough", "Ascof", "Vitex negundo L", 50, 10, "Ascof Forte 600mg Tablet");

// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Headache", "Naproxen Systemic", "Anaprox", 20.75, 10, "Nonsteroidal anti-inflammatory drugs");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Headache", "Ibuprofen Systemic", "Motrin", 18.0, 10, "Nonsteroidal anti-inflammatory drugs");
// INSERT INTO medicine ( Med_for , GenericName , BrandName , Price , Quantity , Description ) VALUES ("Headache", "Acetaminophen", "Fioricet", 162.25, 10, "Analgesic combinations");

// create table medicines (ID int AUTO_INCREMENT, MedicineFor varchar(50) NOT NULL, PRIMARY KEY(ID));

//Create table Allergy (ID int AUTO_INCREMENT, GenericName varchar(50) NOT NULL, BrandName varchar(50) NOT NULL, Price double NOT NULL, Quantity int NOT NULL, Description varchar(500) NOT NULL, PRIMARY KEY(ID));

//Create table BodyPain (ID int AUTO_INCREMENT, GenericName varchar(50) NOT NULL, BrandName varchar(50) NOT NULL, Price double NOT NULL, Quantity int NOT NULL, Description varchar(500) NOT NULL, PRIMARY KEY(ID));

//Create table Cough (ID int AUTO_INCREMENT, GenericName varchar(50) NOT NULL, BrandName varchar(50) NOT NULL, Price double NOT NULL, Quantity int NOT NULL, Description varchar(500) NOT NULL, PRIMARY KEY(ID));

//Create table Headache (ID int AUTO_INCREMENT, GenericName varchar(50) NOT NULL, BrandName varchar(50) NOT NULL, Price double NOT NULL, Quantity int NOT NULL, Description varchar(500) NOT NULL, PRIMARY KEY(ID));


