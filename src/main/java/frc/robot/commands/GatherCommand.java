package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class GatherCommand extends CommandBase {

    WristSubsystem m_WristSubsystem;
   

    public GatherCommand(WristSubsystem wristSubsystem) {
        m_WristSubsystem = wristSubsystem;
        addRequirements(wristSubsystem);
    }   

    @Override
    public void initialize() {
        m_WristSubsystem.deploy();
    }

    @Override
    public void execute() {
        m_WristSubsystem.feedOut();
    }
  
    @Override
    public void end(boolean interrupted) {
        m_WristSubsystem.stopRoller();
        m_WristSubsystem.park();
    }
}
