#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.concurrent.ConcurrentSuite;

import ${package}.GuiceModule;
import ${package}.feedback.StartFormComponentTest;
import ${package}.login.AuthorizationTest;
import ${package}.summer.ImageComponentTest;
import ${package}.summer.SectionHeaderComponentTest;

@Modules(GuiceModule.class)
@RunWith(ConcurrentSuite.class)
@Suite.SuiteClasses({ AuthorizationTest.class, ImageComponentTest.class, SectionHeaderComponentTest.class,
		StartFormComponentTest.class })
public class BobcatSuite {

}