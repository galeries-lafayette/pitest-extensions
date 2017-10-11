package org.pitest.mutationtest.build.intercept.generated;

import org.pitest.classinfo.ClassByteArraySource;
import org.pitest.mutationtest.build.InterceptorParameters;
import org.pitest.mutationtest.build.MutationInterceptor;
import org.pitest.mutationtest.build.MutationInterceptorFactory;
import org.pitest.mutationtest.config.ReportOptions;
import org.pitest.plugin.Feature;

public class GeneratedByAnnotationLineInterceptorFactory implements
        MutationInterceptorFactory {
  public String description() {
    return "disable the mutation coverage for the line generatedOld by any annotations";
  }



  public MutationInterceptor createInterceptor(InterceptorParameters params) {
    return new GeneratedByAnnotationLineInterceptor( params);
  }


  public Feature provides() {
    return Feature.named("GeneratedCodeFilter")
            .withOnByDefault(true)
            .withDescription(description());

  }
}
