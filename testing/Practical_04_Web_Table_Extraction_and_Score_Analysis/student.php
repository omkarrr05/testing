<?php
/*
 * Practical No : 04
 * Topic        : Data Extraction and Score Analysis from Web Table
 * File name    : student.php
 */
$conn = mysqli_connect("localhost", "root", "", "student_marks",3308);
if (!$conn) {
die("Connection Failed: " . mysqli_connect_error());
}
$sql = "SELECT * FROM students";
$result = mysqli_query($conn, $sql);
?>
<!DOCTYPE html>
<html>
<head>
<title>Student Marks</title>
</head>
<body>
<h2>Student Marks</h2>
<table border="1" cellpadding="8" cellspacing="0">
<tr align="center">
<th>Name</th>
<th>English</th>
<th>Maths</th>
<th>Physics</th>
<th>Chemistry</th>
<th>CS & IT</th>
</tr>
<?php
while ($row = mysqli_fetch_assoc($result))
{
?>
<tr align="center">
<td><?php echo $row['name']; ?></td>
<td><?php echo $row['English']; ?></td>
<td><?php echo $row['Maths']; ?></td>
<td><?php echo $row['Physics']; ?></td>
<td><?php echo $row['Chemistry']; ?></td>
<td><?php echo $row['CS & IT']; ?></td>
</tr>
<?php
}
mysqli_close($conn);
?>
</table>
</body>
</html>
