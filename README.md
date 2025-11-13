# Capstones2-ZellieKoreanBBQ
Description:
Zellie Korean BBQ
===============================================================================================================================================================================================================================================================================

is a Java console application that simulates a Korean BBQ restaurant ordering system. Users can create and customize orders with meats, sides, rice, and drinks. The application supports multiple meat selections, premium and regular toppings, special preparation options, and drink sizes. Orders can be viewed, modified, and removed before checkout. Upon confirmation, a timestamped receipt is generated with a full summary and total cost. The project demonstrates object-oriented programming concepts like encapsulation, polymorphism, and separation of concerns in a real-world scenario.

🍽️ Features
===============================================================================================================================================================================================================================================================================
🏠 Home Screen
===============================================================================================================================================================================================================================================================================
1) New Order → start a new order

0) Exit → close the application

📋 Order Screen
===============================================================================================================================================================================================================================================================================

Add Item → create your Korean BBQ plate:

🍗 Meats (select multiple)

🧀 Premium toppings (cheese, fried egg, extra kimchi)

🥬 Plate type (Lettuce Wrap, Rice Bowl, Noodle Bowl)

🌶️ Condiments/sauces

🔥 Special prep (toasted/stuffed/deep fried)

Add Drink → choose drinks with sizes and pricing

Add Side → add sides like kimchi or garlic knots

Add Rice → add rice options

Checkout → display order details, confirm, and generate receipt

Cancel Order → delete current order and return to home screen

🍴 Add Item Customization
===============================================================================================================================================================================================================================================================================

Multiple meats and toppings ✅

Regular toppings automatically included (kimchi, seaweed salad, bean sprouts, cucumber salad)

Extra toppings available for additional cost 💰

Special preparation options supported

💳 Checkout & Receipt
===============================================================================================================================================================================================================================================================================

Itemized order summary with pricing

Calculates total cost

Generates timestamped receipt file in yyyyMMdd-HHmmss.txt format 📝

Order validation ensures minimum 1 item added before checkout

Screenshots
===============================================================================================================================================================================================================================
<img width="1165" height="657" alt="Desktop Screenshot 2025 11 13 - 13 32 12 96" src="https://github.com/user-attachments/assets/47b222e6-7586-4448-abaa-5f1a946ee9e9" />
<img width="1165" height="657" alt="Desktop Screenshot 2025 11 13 - 13 32 21 69" src="https://github.com/user-attachments/assets/688c1865-c6e4-4dbc-90f8-4ee2733a0df0" />
<img width="1165" height="657" alt="Desktop Screenshot 2025 11 13 - 13 33 33 59" src="https://github.com/user-attachments/assets/263fdcfa-e74e-4658-bbbf-91568062ee2d" />
<img width="1165" height="657" alt="Desktop Screenshot 2025 11 13 - 13 34 19 71" src="https://github.com/user-attachments/assets/925ed350-e218-42c6-9c56-8b7ba08f3e22" />
<img width="1165" height="657" alt="Desktop Screenshot 2025 11 13 - 13 34 58 99" src="https://github.com/user-attachments/assets/fb8bcdb3-1f69-4c8d-bd96-eb2d426051cd" />










My code that I made that was interesting
===============================================================================================================================================================================================================================================================================
🗑️ RemoveItem Utility
===============================================================================================================================================================================================================================================================================

The RemoveItem class is a custom utility added to the project to allow users to remove items from their current order. This class provides a simple, interactive menu to display all items in the order, let the user choose one to remove, and update the order list in real time.
<img width="1165" height="657" alt="Desktop Screenshot 2025 11 13 - 12 10 24 35" src="https://github.com/user-attachments/assets/922637ab-5d6c-42ed-bdf1-3d8e7159190f" />

