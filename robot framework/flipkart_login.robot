*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${URL}        https://www.flipkart.com/
${BROWSER}    Chrome
${EMAIL}      testuser@example.com


*** Test Cases ***
Verify Flipkart Login Page Elements
    [Documentation]    Opens Flipkart and verifies the presence of login elements.
    Open Browser To Flipkart
    Handle Default Login Modal
    Verify Login Elements
    Enter Credentials
    [Teardown]    Close Browser

*** Keywords ***
Open Browser To Flipkart
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed    0.5s

Handle Default Login Modal
    [Documentation]    Flipkart usually opens a login modal on valid landing. If not, we click Login.
    # Check if the "Enter Email" field is visible, which indicates the modal is open
    ${modal_visible}=    Run Keyword And Return Status    Element Should Be Visible    xpath=//input[@class='xkp9Hl ZvCKfk']
    Run Keyword If    not ${modal_visible}    Click Login Button

Click Login Button
    Click Element    xpath=//a[contains(@href, '/account/login')]

Verify Login Elements
    Wait Until Element Is Visible    xpath=//input[@type='text']    10s
    Element Should Be Visible    xpath=//button[text()='Request OTP']

Enter Credentials
    Input Text    xpath=//input[@type='text']    ${EMAIL}
    # We do not click 'Request OTP' to avoid spamming/triggering limits in a demo test
    Log    Credentials entered successfully. Ready to request OTP.
