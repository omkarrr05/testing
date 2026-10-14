<!--
  Practical No : 11
  Topic        : Dynamic Web Table Handling and Sorting Validation
  File name    : student.php
-->
<!DOCTYPE html>
<html>
<head>
<title>Student Marks Table</title>
<style>
body {
font-family: Arial;
}
h2 {
text-align: center;
}
table {
border-collapse: collapse;
width: 90%;
margin: auto;
}
th {
background-color: lightblue;
border: 1px solid black;
padding: 10px;
}
td {
border: 1px solid black;
padding: 10px;
text-align: center;
}
</style>
</head>
<body>

<h2>Student Marks Details</h2>

<table id="studentTable">
<thead>
<tr>
<th>ID</th>
<th>Student Name</th>
<th>English</th>
<th>Maths</th>
<th>Science</th>
<th>Computer</th>
<th>Total</th>
<th>Percentage</th>
<th>Result</th>
</tr>
</thead>

<tbody>
<?php
$conn = mysqli_connect("localhost","root","","student_db");

if (!$conn) {
die("Database connection failed: ".mysqli_connect_error());
}

$sql = "SELECT * FROM students";
$result = mysqli_query($conn,$sql);

if (mysqli_num_rows($result) > 0) {

while ($student = mysqli_fetch_assoc($result)) {

$id = $student['id'];
$name = $student['name'];
$english = $student['english'];
$maths = $student['maths'];
$science = $student['science'];
$computer = $student['computer'];

$total = $english + $maths + $science + $computer;
$percentage = $total / 4;

if ($percentage >= 40) {
$result_status = "Pass";
} else {
$result_status = "Fail";
}
?>
<tr>
<td><?php echo $id; ?></td>
<td><?php echo $name; ?></td>
<td><?php echo $english; ?></td>
<td><?php echo $maths; ?></td>
<td><?php echo $science; ?></td>
<td><?php echo $computer; ?></td>
<td><?php echo $total; ?></td>
<td><?php echo number_format($percentage,2); ?></td>
<td><?php echo $result_status; ?></td>
</tr>
<?php
}
} else {
echo "<tr>";
echo "<td colspan='9'>No student records found</td>";
echo "</tr>";
}
mysqli_close($conn);
?>
</tbody>
</table>

</body>
</html>
