package org.slc.sli.modeling.uml2Doc;

import java.io.FileNotFoundException;

import org.slc.sli.modeling.uml.Model;
import org.slc.sli.modeling.uml.Reference;
import org.slc.sli.modeling.uml.Type;
import org.slc.sli.modeling.xmi.reader.XmiReader;

/**
 * A utility for converting XMI to Diagrammatic Predicate Logic (or maybe just documentation :).
 */
public final class Uml2Doc {
    
    public static void main(final String[] args) {
        try {
            final Model model = XmiReader.readInterchange("../data/SLI.xmi");
            final Documentation<Reference> docSource = DocumentationReader
                    .readInterchange("../data/documentation-source.xml");
            final Documentation<Type> docExpanded = DocumentationExpander.expand(docSource, model);
            
            DocumentationWriter.writeDocument(docExpanded, model, "documentation-generated.xml");
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private Uml2Doc() {
        // Prevent instantiation, even through reflection.
        throw new RuntimeException();
    }
}
