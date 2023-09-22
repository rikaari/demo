
document.addEventListener('DOMContentLoaded', function () {
    // Get references to the elements
    const balanceElement = document.getElementById('balance');
    const amountInput = document.getElementById('amount');
    const depositButton = document.getElementById('deposit-button');

    // Function to update the balance on the page
    function updateBalance(newBalance) {
        // Update the account balance with the new value, including the dollar sign ('$')
        balanceElement.textContent = `Account Balance: $${newBalance.toFixed(2)}`;
    }

    // Function to handle the deposit
    function depositMoney() {
        // Get the entered amount and convert it to a float
        const depositAmount = parseFloat(amountInput.value);

        if (isNaN(depositAmount) || depositAmount <= 0) {
            alert('Please enter a valid positive amount to deposit.');
            return;
        }

        // Retrieve the current balance from localStorage
        let currentBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found

        // Calculate the new balance
        const newBalance = currentBalance + depositAmount;

        // Store the new balance in localStorage
        localStorage.setItem('currentBalance', newBalance.toString());

        // Update the balance on the page
        updateBalance(newBalance);

        // Clear the input field
        amountInput.value = '';
    }

    // Add a click event listener to the deposit button
    depositButton.addEventListener('click', depositMoney);

    // Initialize the balance on the page
    const initialBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found
    updateBalance(initialBalance);
});

document.addEventListener('DOMContentLoaded', function () {
    // Get references to the elements
    const balanceElement = document.getElementById('account-balance');
    const amountInput = document.getElementById('amount');
    const withdrawButton = document.getElementById('withdraw-button');

    // Function to update the balance on the page
    function updateBalance(newBalance) {
        // Update the account balance with the new value, including the dollar sign ('$')
        balanceElement.textContent = `Account Balance: $${newBalance.toFixed(2)}`;
    }

    // Function to handle the withdrawal
    function withdrawMoney() {
        // Get the entered amount and convert it to a float
        const withdrawAmount = parseFloat(amountInput.value);

        if (isNaN(withdrawAmount) || withdrawAmount <= 0) {
            alert('Please enter a valid positive amount to withdraw.');
            return;
        }

        // Retrieve the current balance from localStorage
        let currentBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found

        // Check if the withdrawal amount exceeds the current balance
        if (withdrawAmount > currentBalance) {
            alert('Withdrawal amount exceeds the current balance.');
            return;
        }

        // Calculate the new balance after withdrawal
        const newBalance = currentBalance - withdrawAmount;

        // Store the new balance in localStorage
        localStorage.setItem('currentBalance', newBalance.toString());

        // Update the balance on the page
        updateBalance(newBalance);

        // Clear the input field
        amountInput.value = '';
    }

    // Add a click event listener to the withdraw button
    withdrawButton.addEventListener('click', withdrawMoney);

    // Initialize the balance on the page
    const initialBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found
    updateBalance(initialBalance);
});

document.addEventListener('DOMContentLoaded', function () {
    // Get references to the elements
    const balanceElement = document.getElementById('account-balance');
    const amountInput = document.getElementById('amount');
    const transferButton = document.getElementById('transfer-button');

    // Function to update the balance on the page
    function updateBalance(newBalance) {
        // Update the account balance with the new value, including the dollar sign ('$')
        balanceElement.textContent = `Account Balance: $${newBalance.toFixed(2)}`;
    }

    // Function to handle the transfer
    function transferMoney() {
        // Get the entered amount and convert it to a float
        const transferAmount = parseFloat(amountInput.value);

        if (isNaN(transferAmount) || transferAmount <= 0) {
            alert('Please enter a valid positive amount to transfer.');
            return;
        }

        // Retrieve the current balance from localStorage
        let currentBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found

        // Check if the transfer amount exceeds the current balance
        if (transferAmount > currentBalance) {
            alert('Transfer amount exceeds the current balance.');
            return;
        }

        // Calculate the new balance after the transfer
        const newBalance = currentBalance - transferAmount;

        // Store the new balance in localStorage
        localStorage.setItem('currentBalance', newBalance.toString());

        // Update the balance on the page
        updateBalance(newBalance);

        // Clear the input field
        amountInput.value = '';
    }

    // Add a click event listener to the transfer button
    transferButton.addEventListener('click', transferMoney);

    // Initialize the balance on the page
    const initialBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found
    updateBalance(initialBalance);
});


document.addEventListener('DOMContentLoaded', function () {
    // Get references to the elements
    const balanceElement = document.getElementById('account-balance');
    const amountInput = document.getElementById('amount');
    const paymentButton = document.getElementById('payment-button');

    // Function to update the balance on the page
    function updateBalance(newBalance) {
        // Update the account balance with the new value, including the dollar sign ('$')
        balanceElement.textContent = `Account Balance: $${newBalance.toFixed(2)}`;
    }

    // Function to make a payment
    function makePayment() {
        // Get the entered payment amount and convert it to a float
        const paymentAmount = parseFloat(amountInput.value);

        if (isNaN(paymentAmount) || paymentAmount <= 0) {
            alert('Please enter a valid positive payment amount.');
            return;
        }

        // Retrieve the current balance from localStorage
        let currentBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found

        // Check if the payment amount exceeds the current balance
        if (paymentAmount > currentBalance) {
            alert('Payment amount exceeds the current balance.');
            return;
        }

        // Calculate the new balance after the payment
        const newBalance = currentBalance - paymentAmount;

        // Store the new balance in localStorage
        localStorage.setItem('currentBalance', newBalance.toString());

        // Update the balance on the page
        updateBalance(newBalance);

        // Clear the input field
        amountInput.value = '';
    }

    // Add a click event listener to the payment button
    paymentButton.addEventListener('click', makePayment);

    // Initialize the balance on the page
    const initialBalance = parseFloat(localStorage.getItem('currentBalance')) || 1000.00; // Default to 1000.00 if not found
    updateBalance(initialBalance);
});


