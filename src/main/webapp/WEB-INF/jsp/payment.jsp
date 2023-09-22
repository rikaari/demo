<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/site.css">
    <script src="js/deposit.js"></script>

    <title>Make a Payment</title>
</head>
<body>
    <h1>Make a Payment</h1>
    <div id="account-balance">
        Account Balance: $1000.00 <!-- Replace with your actual account balance -->
    </div>
    <div class="input-container">
        <input type="number" id="amount" class="input-field" placeholder="Enter Amount">
    </div>

    <div class="input-container">
        <input type="text" id="reason" class="input-field" placeholder="Reason for Payment">
    </div>
    <div class="input-container">
        <input type="text" id="receiver" class="input-field" placeholder="Receiver's Username or Email">
    </div>

    <button id="payment-button" class="button">Make Payment</button>

</body>
</html>
