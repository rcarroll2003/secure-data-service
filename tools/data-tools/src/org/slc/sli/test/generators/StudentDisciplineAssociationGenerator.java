package org.slc.sli.test.generators;

import java.util.Random;

import org.slc.sli.test.edfi.entities.*;

public class StudentDisciplineAssociationGenerator {

    public StudentDisciplineIncidentAssociation generate(String studentDisciplineId, String delimiter) {
    	StudentDisciplineIncidentAssociation studentDisciplineAssociation = new StudentDisciplineIncidentAssociation();

    	try {
            Random random = new Random();
            
            String studentId = studentDisciplineId.split(delimiter)[0];
            String discId = studentDisciplineId.split(delimiter)[2];
            
            StudentIdentityType sit = new StudentIdentityType();
            sit.setStudentUniqueStateId(studentId);
            StudentReferenceType srt = new StudentReferenceType();
            srt.setStudentIdentity(sit);
            studentDisciplineAssociation.setStudentReference(srt);

            DisciplineIncidentIdentityType diit = new DisciplineIncidentIdentityType();
            diit.setIncidentIdentifier(discId);
            diit.getStateOrganizationIdOrEducationOrgIdentificationCode().add("ThisStateID");
            DisciplineIncidentReferenceType dirt = new DisciplineIncidentReferenceType();
            dirt.setDisciplineIncidentIdentity(diit);
            studentDisciplineAssociation.setDisciplineIncidentReference(dirt);
            
            StudentParticipationCodeType spcType = null;
            int randInt4 = random.nextInt(4);
                 if (randInt4 == 0) spcType = StudentParticipationCodeType.PERPETRATOR;
            else if (randInt4 == 1) spcType = StudentParticipationCodeType.REPORTER;
            else if (randInt4 == 2) spcType = StudentParticipationCodeType.VICTIM;
            else if (randInt4 == 3) spcType = StudentParticipationCodeType.WITNESS;
            studentDisciplineAssociation.setStudentParticipationCode(spcType);
            
            // Behaviors (optional)
            
            // Secondary Behaviors (optional)
              
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return studentDisciplineAssociation;
    }

	
}
