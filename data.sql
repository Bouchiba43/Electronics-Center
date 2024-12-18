-- -----------------------------------------------------
-- Schema full-stack-sports-center
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS `electronicsDB`;

USE `electronicsDB` ;

-- Drop existing tables if they exist
DROP TABLE IF EXISTS Brand;
DROP TABLE IF EXISTS Type;
DROP TABLE IF EXISTS Product;

-- Create the Brand table
CREATE TABLE `Brand` (
                         `Id` INT AUTO_INCREMENT PRIMARY KEY,
                         `Name` VARCHAR(255) NOT NULL
);

-- Insert data into the Brand table
INSERT INTO Brand (Name) VALUES
                             ('Adidas'),
                             ('ASICS'),
                             ('Victor'),
                             ('Yonex'),
                             ('Puma'),
                             ('Nike'),
                             ('Babolat');

-- Create the Type table
CREATE TABLE `Type` (
                        `Id` INT AUTO_INCREMENT PRIMARY KEY,
                        `Name` VARCHAR(255) NOT NULL
);

-- Insert data into the Type table
INSERT INTO Type (Name) VALUES
                            ('Shoes'),
                            ('Rackets'),
                            ('Football'),
                            ('Kit Bags');

-- Create the Product table
CREATE TABLE `Product` (
                           `Id` INT AUTO_INCREMENT PRIMARY KEY,
                           `Name` VARCHAR(255) NOT NULL,
                           `Description` TEXT,
                           `Price` DECIMAL(10, 2) NOT NULL,
                           `PictureUrl` VARCHAR(255),
                           `ProductTypeId` INT NOT NULL,
                           `ProductBrandId` INT NOT NULL,
                           FOREIGN KEY (`ProductTypeId`) REFERENCES `Type`(`Id`),
                           FOREIGN KEY (`ProductBrandId`) REFERENCES `Brand`(`Id`)
);

-- Insert data into the Product table
INSERT INTO Product (Name, Description, Price, PictureUrl, ProductTypeId, ProductBrandId) VALUES
                                                                                              ('Apple MacBook Pro 16-inch (2023)', 'The MacBook Pro is the ultimate laptop for pro users, powered by the M2 Max chip with a stunning 16-inch Retina display, 32GB RAM, and 1TB SSD for seamless performance.', 2399, 'images/Product/apple_macbook_pro_16.png', 1, 1),
                                                                                              ('Apple MacBook Air 13-inch (2023)', 'The new MacBook Air features the M2 chip, a 13.6-inch Retina display, and all-day battery life in a thin, lightweight design.', 1199, 'images/Product/apple_macbook_air_13.png', 1, 1),
                                                                                              ('Dell XPS 13', 'The Dell XPS 13 is an ultra-portable laptop with a powerful Intel Core i7 processor, 16GB RAM, and a 512GB SSD, perfect for work or play on the go.', 1499, 'images/Product/dell_xps_13.png', 1, 2),
                                                                                              ('HP Spectre x360 14', 'The HP Spectre x360 14 is a premium convertible laptop with a 13.5-inch OLED touchscreen display, Intel Core i7, and 16GB RAM.', 1699, 'images/Product/hp_spectre_x360.png', 1, 3),
                                                                                              ('Samsung Galaxy S23 Ultra', 'The Galaxy S23 Ultra offers a 200MP camera, Snapdragon 8 Gen 2 chipset, and a large 6.8-inch AMOLED display for an immersive experience.', 1399, 'images/Product/samsung_galaxy_s23_ultra.png', 2, 4),
                                                                                              ('iPhone 15 Pro Max', 'The iPhone 15 Pro Max features a titanium design, 48MP camera system, and the A17 Pro chip for incredible performance and battery life.', 1499, 'images/Product/iphone_15_pro_max.png', 2, 1),
                                                                                              ('Google Pixel 8 Pro', 'Capture incredible photos with the Google Pixel 8 Pro, featuring a 50MP main camera, Google Tensor G3 chip, and a smooth 120Hz OLED display.', 999, 'images/Product/google_pixel_8_pro.png', 2, 5),
                                                                                              ('OnePlus 11 5G', 'The OnePlus 11 offers a 120Hz AMOLED display, Snapdragon 8 Gen 2, and a 50MP triple camera setup for stunning visuals and fast performance.', 899, 'images/Product/oneplus_11_5g.png', 2, 6),
                                                                                              ('Apple iPad Pro 12.9-inch (2023)', 'The iPad Pro 12.9-inch is equipped with the M2 chip and a Liquid Retina XDR display, offering the best tablet experience for productivity and entertainment.', 1099, 'images/Product/apple_ipad_pro_12.png', 3, 1),
                                                                                              ('Samsung Galaxy Tab S8 Ultra', 'The Samsung Galaxy Tab S8 Ultra has an expansive 14.6-inch Super AMOLED display, Snapdragon 8 Gen 1, and S Pen support for creative professionals.', 1299, 'images/Product/samsung_galaxy_tab_s8_ultra.png', 3, 4),
                                                                                              ('Microsoft Surface Pro 9', 'The Surface Pro 9 is a versatile tablet with a 12.3-inch PixelSense display, Intel Core i7 processor, and the option of 4G LTE for mobility.', 1499, 'images/Product/microsoft_surface_pro_9.png', 3, 7),
                                                                                              ('Sony WH-1000XM5 Noise Cancelling Headphones', 'The Sony WH-1000XM5 offers world-class noise cancellation, premium sound, and a comfortable fit, perfect for travel and daily use.', 349, 'images/Product/sony_wh1000xm5.png', 4, 8),
                                                                                              ('Bose QuietComfort 45', 'Bose QuietComfort 45 headphones deliver top-tier noise cancellation, high-fidelity sound, and all-day comfort for work or relaxation.', 329, 'images/Product/bose_qc45.png', 4, 9),
                                                                                              ('Apple AirPods Pro 2nd Generation', 'The AirPods Pro features active noise cancellation, transparency mode, and spatial audio for an immersive listening experience.', 249, 'images/Product/apple_airpods_pro_2.png', 4, 1),
                                                                                              ('Samsung Galaxy Buds Pro', 'The Galaxy Buds Pro offer rich sound quality, active noise cancellation, and a comfortable fit for an unparalleled audio experience.', 199, 'images/Product/samsung_galaxy_buds_pro.png', 4, 4),
                                                                                              ('Razer Naga X RGB Gaming Mouse', 'The Razer Naga X offers precision and performance for gamers with customizable RGB lighting and 16 programmable buttons.', 69, 'images/Product/razer_naga_x.png', 5, 10),
                                                                                              ('Logitech MX Master 3S Wireless Mouse', 'The Logitech MX Master 3S features ultra-precise tracking, customizable buttons, and ergonomic design for a productive workspace.', 99, 'images/Product/logitech_mx_master_3s.png', 5, 11),
                                                                                              ('Seagate Expansion 2TB External Hard Drive', 'The Seagate Expansion offers 2TB of external storage with USB 3.0 compatibility, ensuring fast and reliable backups.', 79, 'images/Product/seagate_expansion_2tb.png', 6, 12),
                                                                                              ('Western Digital My Passport 1TB', 'The WD My Passport 1TB is a compact external hard drive with fast data transfer rates and password protection for your sensitive files.', 59, 'images/Product/wd_my_passport_1tb.png', 6, 13),
                                                                                              ('Canon EOS 90D DSLR Camera', 'The Canon EOS 90D offers a 32.5MP sensor, 4K video recording, and fast autofocus, making it ideal for both photography and videography.', 1199, 'images/Product/canon_eos_90d.png', 7, 14),
                                                                                              ('Sony Alpha 7 III Mirrorless Camera', 'The Sony Alpha 7 III offers stunning 4K video, 24.2MP resolution, and fast autofocus for professional-level photography and video recording.', 1799, 'images/Product/sony_alpha_7iii.png', 7, 8);