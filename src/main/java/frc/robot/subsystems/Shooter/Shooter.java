package frc.robot.subsystems.Shooter;
import com.revrobotics.CANSparkFlex;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Shooter {
    
  public CANSparkFlex shooterMotor;

  public Shooter() {
    // Id 16 is the top, Id 26 is the bottom
    shooterMotor = new CANSparkFlex(16,MotorType.kBrushless);
    shooterMotor.setSmartCurrentLimit(80);
    shooterMotor.setInverted(false);
    shooterMotor.setIdleMode(IdleMode.kCoast);
    shooterMotor = new CANSparkFlex(26,MotorType.kBrushless);
    shooterMotor.setSmartCurrentLimit(80);
    shooterMotor.setInverted(true);
    shooterMotor.setIdleMode(IdleMode.kCoast);
  }

    public void setPower(double power) {
    shooterMotor.set(power);
  }

    // @Override public void periodic() {}
}
