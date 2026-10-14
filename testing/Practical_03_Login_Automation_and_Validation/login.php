<?php
/*
 * Practical No : 03
 * Topic        : Login Automation and Validation
 * File name    : login.php
 */
$username = $_POST['username'];
$password = $_POST['password'];
// Demo credentials
$correct_username = "admin";
$correct_password = "12345";
if ($username == $correct_username && $password == $correct_password) {
header("Location: success.php");
exit();
} else {
echo "Invalid Username or Password!";
}
?>
