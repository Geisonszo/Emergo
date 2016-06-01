package unlv.erc.emergo.controller;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.runner.RunWith;

import unlv.erc.emergo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class RegisterUserControllerTest extends ActivityInstrumentationTestCase2<RegisterUserController>{

    public RegisterUserControllerTest() {
        super(RegisterUserController.class);
    }

    public void testSaveOption(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.saveButton)).check(matches(isDisplayed()));
        onView(withId(R.id.saveButton)).check(matches(withText("Salvar")));
    }

    public void testIfNameLabelIsCorrect(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.fullNameTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.fullNameTextView)).check(matches(withText("Nome")));
    }

    public void testNameField(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.fullNameTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.fullNameEditText)).perform(typeText("MrVictor"));
        onView(withId(R.id.fullNameEditText)).perform(click());
        onView(withId(R.id.fullNameEditText)).check(matches(withText("MrVictor")));
    }

    public void testIfDateLabelIsCorrect() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.birthdayTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.birthdayTextView)).check(matches(withText("Data de Nascimento")));
    }

    public void testBirthdayField(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.birthdayTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.birthdayEditText)).perform(typeText("14/03/1912"));
        onView(withId(R.id.birthdayEditText)).perform(click());
        onView(withId(R.id.birthdayEditText)).check(matches(withText("14/03/1912")));
    }

    public void testIfTypeBloodLabelIsCorrect() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.typeBloodTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.typeBloodTextView)).check(matches(withText("Tipo Sanguíneo")));
    }

    public void testTypeBloodField(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.typeBloodTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.typeBloodSpinner)).perform(typeText("AB+"));
        onView(withId(R.id.typeBloodSpinner)).perform(click());
        onView(withId(R.id.typeBloodSpinner)).check(matches(withText("AB+")));
    }

    public void testIfCardiacLabelIsCorrect() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.cardiacTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.cardiacTextView)).check(matches(withText("Cardiaco")));
    }

    public void testCardiacFieldOptionYes(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.cardiacTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.cardiacSpinner)).perform(typeText("Sim"));
        onView(withId(R.id.cardiacSpinner)).perform(click());
        onView(withId(R.id.cardiacSpinner)).check(matches(withText("Sim")));
    }

    public void testCardiacFieldOptionNo(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.cardiacTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.cardiacSpinner)).perform(typeText("Não"));
        onView(withId(R.id.cardiacSpinner)).perform(click());
        onView(withId(R.id.cardiacSpinner)).check(matches(withText("Não")));
    }

    public void testCardiacFieldOptionIDontKnow(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.cardiacTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.cardiacSpinner)).perform(typeText("Não Sei"));
        onView(withId(R.id.cardiacSpinner)).perform(click());
        onView(withId(R.id.cardiacSpinner)).check(matches(withText("Não Sei")));
    }

    public void testIfDiabeticLabelIsCorrect() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.diabeticTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.diabeticTextView)).check(matches(withText("Diabetico")));
    }

    public void testDiabeticFieldOptionYes(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.diabeticTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.diabeticSpinner)).perform(typeText("Sim"));
        onView(withId(R.id.diabeticSpinner)).perform(click());
        onView(withId(R.id.diabeticSpinner)).check(matches(withText("Sim")));
    }

    public void testDiabeticFieldOptionNo(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.diabeticTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.diabeticSpinner)).perform(typeText("Não"));
        onView(withId(R.id.diabeticSpinner)).perform(click());
        onView(withId(R.id.diabeticSpinner)).check(matches(withText("Não")));
    }

    public void testDiabeticFieldOptionIDontKnow(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.diabeticTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.diabeticSpinner)).perform(typeText("Não Sei"));
        onView(withId(R.id.diabeticSpinner)).perform(click());
        onView(withId(R.id.diabeticSpinner)).check(matches(withText("Não Sei")));
    }

    public void testIfHypertensionLabelIsCorrect() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.hipertensionTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.hipertensionTextView)).check(matches(withText("Hipertenso")));
    }

    public void testHypertensionFieldOptionYes(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.hipertensionTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.hipertensionSpinner)).perform(typeText("Sim"));
        onView(withId(R.id.hipertensionSpinner)).perform(click());
        onView(withId(R.id.hipertensionSpinner)).check(matches(withText("Sim")));
    }

    public void testHypertensionFieldOptionNo(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.hipertensionTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.hipertensionSpinner)).perform(typeText("Não"));
        onView(withId(R.id.hipertensionSpinner)).perform(click());
        onView(withId(R.id.hipertensionSpinner)).check(matches(withText("Não")));
    }

    public void testHypertensionFieldOptionIDontKnow(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.hipertensionTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.hipertensionSpinner)).perform(typeText("Não Sei"));
        onView(withId(R.id.hipertensionSpinner)).perform(click());
        onView(withId(R.id.hipertensionSpinner)).check(matches(withText("Não Sei")));
    }

    public void testIfSeropositiveLabelIsCorrect() {
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.seropositiveTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.seropositiveTextView)).check(matches(withText("Soropositivo")));
    }

    public void testSeropositiveFieldOptionYes(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.seropositiveTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.soropositiveSpinner)).perform(typeText("Sim"));
        onView(withId(R.id.soropositiveSpinner)).perform(click());
        onView(withId(R.id.soropositiveSpinner)).check(matches(withText("Sim")));
    }

    public void testSeropositiveFieldOptionNo(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.seropositiveTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.soropositiveSpinner)).perform(typeText("Não"));
        onView(withId(R.id.soropositiveSpinner)).perform(click());
        onView(withId(R.id.soropositiveSpinner)).check(matches(withText("Não")));
    }

    public void testSeropositiveFieldOptionIDontKnow(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Salvar")).perform(click());
        onView(withId(R.id.seropositiveTextView)).check(matches(isDisplayed()));
        onView(withId(R.id.soropositiveSpinner)).perform(typeText("Não Sei"));
        onView(withId(R.id.soropositiveSpinner)).perform(click());
        onView(withId(R.id.soropositiveSpinner)).check(matches(withText("Não Sei")));
    }

    public void testUpdateOption(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Alterar")).perform(click());
        onView(withId(R.id.updateButton)).check(matches(isDisplayed()));
        onView(withId(R.id.updateButton)).check(matches(withText("Alterar")));
    }

    public void testDeleteOption(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getTargetContext());
        onView(withText("Excluir")).perform(click());
        onView(withId(R.id.deleteButton)).check(matches(isDisplayed()));
        onView(withId(R.id.deleteButton)).check(matches(withText("Excluir")));
    }
}
