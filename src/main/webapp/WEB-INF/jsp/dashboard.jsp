
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/site.css">
    <script src="js/deposit.js"></script>

    <title>Dashboard</title>
</head>
<body>
    <h1>Welcome to Your Dashboard</h1>
    <div id="account-balance">
        Account Balance: $1000.00 <!-- Replace with your actual account balance -->
    </div>
    <div class="button-container">
        <a href="/transfer" id="transfer-button" class="button">Transfer</a>
        <a href="/deposit" id="deposit-button" class="button">Deposit</a>
        <a href="/withdraw" id="withdraw-button" class="button">Withdraw</a>
        <a href="/payment" id="payment-button" class="button">Payment</a>
    </div>
</body>
</html>




