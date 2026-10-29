package org.firstinspires.ftc.robotcontroller;

import com.qualcomm.robotcore.eventloop.SyncdDevice;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class TestOpMode extends LinearOpMode {
    DcMotor frontLeftDrive;
    DcMotor backLeftDrive;
    DcMotor frontRightDrive;

    DcMotor backRightDrive;

    public void runOpMode() {
        frontLeftDrive = hardwareMap.get(DcMotor.class, "fl");
        backLeftDrive = hardwareMap.get(DcMotor.class, "bl");
        frontRightDrive = hardwareMap.get(DcMotor.class, "fr");
        backRightDrive = hardwareMap.get(DcMotor.class, "bl");

        waitForStart();

        telemetry.addData("hi",frontLeftDrive.getCurrentPosition());
        telemetry.update();
        float number = 1;
        while (opModeIsActive()) {
            frontLeftDrive.setPower(gamepad1.left_stick_y * number);
            frontRightDrive.setPower(gamepad1.left_stick_y * number);
            backLeftDrive.setPower(gamepad1.left_stick_y * number);
            backRightDrive.setPower(gamepad1.left_stick_y * number);
        }
    }
}

