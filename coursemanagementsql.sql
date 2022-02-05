DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `firstName` varchar(255) default NULL,
  `lastName` varchar(255) default NULL,
  `password` varchar(255),
  `email` varchar(255) default NULL,
  `currentSemester` mediumint default NULL,
  `matricNo` varchar(255),
  `CGPA` mediumint default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `students` (`firstName`,`lastName`,`password`,`email`,`currentSemester`,`matricNo`,`CGPA`)
VALUES
  ("Dexter","Adria","TYN48ANH8NB","maecenas.iaculis@protonmail.org",3,"Z8U2F9",1.8),
  ("Suki","Keith","VAS76IPA4CI","vestibulum.nec@protonmail.org",2,"U1W2P7",2.8),
  ("Colton","Benjamin","KBT37GRI1LZ","nam@protonmail.ca",7,"I5I1B4",2.8),
  ("Tanek","Baker","QVQ14LGU0UG","nulla.facilisis@protonmail.ca",4,"Y1E1N2",3.8),
  ("Owen","Imani","FRX88RUS5BD","non.feugiat.nec@icloud.edu",1,"C4Q7X6",3.8),
  ("Gavin","Chantale","FBB37LVR3UQ","nunc.quis@outlook.com",3,"Y8V3Y4",3.8),
  ("Blossom","Cheyenne","MLG55TZM5LM","ultricies.ligula.nullam@outlook.couk",6,"B2W7W7",1.8),
  ("Tarik","Charissa","TKN52SCJ1YC","mollis@hotmail.org",5,"B6N2Y4",2.8),
  ("Chava","Marvin","PMP74UFS8FA","nulla.aliquet.proin@protonmail.ca",1,"P7F4O5",2.8),
  ("Zephania","Beau","LQP83WXM7VQ","molestie.arcu@aol.couk",2,"N4Y0C0",1.8);
INSERT INTO `students` (`firstName`,`lastName`,`password`,`email`,`currentSemester`,`matricNo`,`CGPA`)
VALUES
  ("Nehru","Forrest","GWG30YUE4JU","metus.aenean.sed@protonmail.org",1,"L4C7V6",2.8),
  ("Maisie","Ignacia","BRN88LMX3PN","ut@google.com",2,"O9H1J1",2.8),
  ("Germane","Harding","SQQ73KUD6QK","curabitur@google.net",8,"H0R1V8",3.8),
  ("Eric","Mary","GLS54OIS4TL","a.ultricies.adipiscing@google.org",7,"X7V6J7",2.8),
  ("Tanek","Ivor","FDE67JGY6XT","integer.vulputate@google.org",1,"X6J1S6",1.8),
  ("Davis","Fiona","BMT56KSC1XG","phasellus.vitae@google.net",4,"N3G0T3",3.8),
  ("Amir","Steel","XUV67DTD4OR","nisi@hotmail.edu",8,"F1K4D1",2.8),
  ("Noble","Piper","NDI33VMN4FW","purus@google.ca",7,"I5J6D4",2.8),
  ("Imelda","Xantha","QTE12BJQ4AO","neque.nullam@google.couk",2,"Q4D8H8",2.8),
  ("Gray","Louis","AWH23IXG6GK","tempus.scelerisque@hotmail.edu",3,"O2P4D8",2.8);


DROP TABLE IF EXISTS `teachers`;

CREATE TABLE `teachers` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `firstName` varchar(255) default NULL,
  `lastName` varchar(255) default NULL,
  `password` varchar(255),
  `email` varchar(255) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `teachers` (`firstName`,`lastName`,`password`,`email`)
VALUES
  ("Celeste","Evelyn","PZS50LLK4PD","et.netus@protonmail.couk"),
  ("Aristotle","Keegan","QNE17JYP9WH","eros.proin@hotmail.com"),
  ("Ori","Lionel","IPH70PMS9ZP","quis.pede@protonmail.com"),
  ("Beverly","Leigh","RGW17SHJ6BI","pulvinar.arcu.et@protonmail.com"),
  ("Tanisha","Upton","OFQ35YUD3BT","donec@hotmail.ca");


DROP TABLE IF EXISTS `adminstrators`;

CREATE TABLE `adminstrators` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `firstName` varchar(255) default NULL,
  `lastName` varchar(255) default NULL,
  `password` varchar(255),
  `email` varchar(255) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `adminstrators` (`firstName`,`lastName`,`password`,`email`)
VALUES
  ("Celeste","Evelyn","PZS50LLK4PD","et.netus@protonmail.couk"),
  ("Aristotle","Keegan","QNE17JYP9WH","eros.proin@hotmail.com"),
  ("Ori","Lionel","IPH70PMS9ZP","quis.pede@protonmail.com"),
  ("Beverly","Leigh","RGW17SHJ6BI","pulvinar.arcu.et@protonmail.com"),
  ("Tanisha","Upton","OFQ35YUD3BT","donec@hotmail.ca");


