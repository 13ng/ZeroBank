package com.cydeo.pages;
////th[.='Description']/.. description TH

import com.cydeo.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class AccountActivityPage extends BasePage {

    public AccountActivityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //PAGES
    private static final String ACCOUNT_SUMMARY = "account summary";
    public String getAccountSummary() {
        return ACCOUNT_SUMMARY;
    }
    @FindBy(xpath = "//a[.='Account Summary']")
    public WebElement account_summary;

    private static final String ACCOUNT_ACTIVITY = "account activity";
    public String getAccountActivity() {
        return ACCOUNT_ACTIVITY;
    }
    @FindBy(xpath = "//a[.='Account Activity']")
    public WebElement account_activity;

    private static final String TRANSFER_FOUNDS = "transfer_founds";
    public String getTransferFounds() {
        return TRANSFER_FOUNDS;
    }
    @FindBy(xpath = "//a[.='Transfer Funds']")
    public WebElement transfer_founds;

    private static final String PAY_BILLS = "pay bills";
    public String getPayBills() {
        return PAY_BILLS;
    }
    @FindBy(xpath = "//a[.='Pay Bills']")
    public WebElement pay_bills;

    private static final String MONEY_MAP = "money map";
    public String getMoneyMap() {
        return MONEY_MAP;
    }
    @FindBy(xpath = "//a[.='My Money Map']")
    public WebElement money_map;

    private static final String ONLINE_STATEMENT = "online statement";
    public String getOnlineStatement() {
        return ONLINE_STATEMENT;
    }
    @FindBy(xpath = "//a[.='Online Statements']")
    public WebElement online_statement;


public WebElement getPage_link(String type){
    switch (type) {
        case MONEY_MAP: return money_map;
        case ONLINE_STATEMENT: return online_statement;
        case PAY_BILLS:return pay_bills;
        case TRANSFER_FOUNDS:return transfer_founds;
        case ACCOUNT_ACTIVITY:return account_activity;
        case ACCOUNT_SUMMARY:return account_summary;
        default:throw new org.openqa.selenium.NoSuchElementException("String is not much");
    }


}




    //TABS SHOW & FIND
    private static final String SHOW_TRANSACTION = "show transaction";

    public String getShowTransaction() {
        return SHOW_TRANSACTION;
    }

    @FindBy(xpath = "//a[.='Show Transactions']")
    public WebElement show_transaction;

    private static final String FIND_TRANSACTION = "find transaction";

    public String getFindTransaction() {
        return FIND_TRANSACTION;
    }

    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement find_transaction;





    //FIND TRANSACTION INPUTS

    private static final String DESCRIPTION = "description";

    public String getDescription() {
        return DESCRIPTION;
    }

    @FindBy(css = "input[id='aa_description']")
    public WebElement find_transaction_Description;

    private static final String FROM_DATA = "from data";

    public String getFromData() {
        return FROM_DATA;
    }

    @FindBy(css = "input[id='aa_fromDate']")
    public WebElement find_transaction_FromData;

    private static final String TO_DATA = "to data";

    public String getToData() {
        return TO_DATA;
    }

    @FindBy(css = "input[id='aa_toDate']")
    public WebElement find_transaction_ToData;

    private static final String FROM_AMOUNT = "from amount";

    public String getFromAmount() {
        return FROM_AMOUNT;
    }

    @FindBy(css = "input[id='aa_fromAmount']")
    public WebElement find_transaction_FromAmount;

    private static final String TO_AMOUNT = "to amount";

    public String getToAmount() {
        return TO_AMOUNT;
    }

    @FindBy(css = "input[id='aa_toAmount']")
    public WebElement find_transaction_ToAmount;

    //FIND TRANSACTION TOOLS
//button[type='submit']
    private static final String SUBMIT_BUTTON = "submit button";

    public String getSubmitButton() {
        return SUBMIT_BUTTON;
    }

    @FindBy(css = "button[type='submit']")
    public WebElement button_submit;

////button[.='Find']
private static final String FIND_BUTTON = "find button";

    public String getFindButtonButton() {
        return FIND_BUTTON;
    }

    @FindBy(xpath = "//button[.='Find']")
    public WebElement find_button;





    //Dropdowns
    private static final String TYPE_TRANSACTION_DROPDOWN = "type dropdown";

    public String getTypeDropdown() {
        return TYPE_TRANSACTION_DROPDOWN;
    }

    @FindBy(css = "select[id='aa_type']")
    public WebElement type_transaction_dropdown;

    private static final String SHOW_TRANSACTION_DROPDOWN = "show transaction";

    public String getShowTransactionDropdown() {
        return SHOW_TRANSACTION_DROPDOWN;
    }

    @FindBy(css = "select[id='aa_accountId']")
    public WebElement show_transaction_dropdown;


    //Tables
    private static final String SHOW_TRANSACTION_TABLE = "transaction table";

    public String getShowTransactionTable() {
        return SHOW_TRANSACTION_TABLE;
    }

    @FindBy(css = "table[class='table table-condensed table-hover']")
    public WebElement show_transaction_table;

    private static final String FIND_TRANSACTION_TABLE = "transaction table";

    public String getFindTransactionTable() {
        return FIND_TRANSACTION_TABLE;
    }

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table[@class='table table-condensed table-hover']")
    public WebElement find_transaction_table;
    private static final String TABLES = "tables";

    public String getTables() {
        return TABLES;
    }

    @FindBy(xpath = "//table")
    public List<WebElement> table;

    private static final String TABLES_ELEMENTS = "tables ELEMENTS";

    public String getTablesElements() {
        return TABLES_ELEMENTS;
    }

    @FindBy(xpath = "//table//tr/td")
    public List<WebElement> table_elements;


    private static final String TABLES_ROW = "tables row";

    public String getTablesRow() {
        return TABLES_ROW;
    }

    @FindBy(xpath = "//table//tr")
    public List<WebElement> table_rows;

    private static final String TABLES_LINKS = "tables links";

    public String getTablesLinks() {
        return TABLES_LINKS;
    }

    @FindBy(xpath = "//table//tr/td/a")
    public List<WebElement> table_links;
    //error
    //all_transactions_for_account
    private static final String ALL_TRANSACTION_FOR_ACCOUNT = "all transactions for account";
    public String getAllTransactionForAccount(){return ALL_TRANSACTION_FOR_ACCOUNT;}
    @FindBy(xpath = "//div[@id='all_transactions_for_account']")
    public WebElement all_transactions_for_account;

private static final String ALL_TRANSACTION_TABLE = "all transactions_table";
    public String getAllTransactionTable(){return ALL_TRANSACTION_TABLE;}
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']")
    public WebElement all_transactions_table;

    private static final String NO_RESULT_EXEXPTION = "show result exeption";

    public String getNoResultExexption() {
        return NO_RESULT_EXEXPTION;
    }

    @FindBy(xpath = "//div[@id='all_transactions_for_account']/div[contains(.,'No results')]")
    public WebElement no_result_exeption;

private static final String NO_RESULT_FIND_TRANS = "show result find transaction page ";

    public String getNoResultFindTrans() {
        return NO_RESULT_FIND_TRANS;
    }

    @FindBy(xpath = "//div[@class='well']")
    public WebElement no_result_find_trans;

    //Choose needed option in dropdown
    public void dropdown_get_accounts(WebElement dropdownLocator, String str) {
        Select select = new Select(dropdownLocator);
        select.selectByVisibleText(str);
        // WebElement needed = select.getFirstSelectedOption();


    }

    //Assert method to compare size of dropdowns and List with link on accounts
    public boolean dropdown_have_accounts(WebElement dropdown_element, List<WebElement> second) {
        Select select = new Select(dropdown_element);
        List<WebElement> first = select.getOptions();

        return first.size() == second.size();
    }


    //this one collect all table elements by type from Table.
    public List<String> table_take_inputs(List<WebElement> t_elements, String input) {
        List<String> result = new ArrayList<>();
        t_elements.removeIf(p -> p.getText().equals("Data") || p.getText().equals("Account") || p.getText().equals("Balance") || p.getText().equals("Description") || p.getText().equals("Withdrawal") || p.getText().equals("Deposit")
        );
//|| p.getText().equals("Account") || p.getText().equals("Balance") || p.getText().equals("Description") || p.getText().equals("Withdrawal") || p.getText().equals("Deposit")

        switch (input) {
            case "data":
                for (int i = 0; i < t_elements.size(); ) {
                    result.add(t_elements.get(i).getText());
                    i += 4;
                }
                break;
            case "description":
                for (int i = 1; i < t_elements.size(); ) {
                    result.add(t_elements.get(i).getText());
                    i += 4;
                }
                break;
            case "deposit":
                for (int i = 2; i < t_elements.size(); ) {
                    result.add(t_elements.get(i).getText());
                    i += 4;
                }
                result.removeIf(p -> p.isEmpty() || p.isBlank());
                break;
            case "withdrawal":
                for (int i = 3; i < t_elements.size(); ) {
                    result.add(t_elements.get(i).getText());
                    i += 4;
                }
                result.removeIf(p -> p.isEmpty() || p.isBlank());
                break;
            case "account":
                for (int i = 0; i < t_elements.size(); ) {
                    result.add(t_elements.get(i).getText());
                    i += 3;
                }
                result.removeIf(p -> p.isEmpty() || p.isBlank());
                break;
            case "balance":
                for (int i = 2; i < t_elements.size(); ) {
                    result.add(t_elements.get(i).getText());
                    i += 3;
                }
                result.removeIf(p -> p.isEmpty() || p.isBlank());
                break;
            default:
                System.out.println("check string in parameters");
        }//Account
//result.removeIf(p->p.equals("0"));


        return result;
    }

    //This method - 1.makes input in choosed bar,  2. put button, 3. clear bar.
    public void input_click_clear(List<String> input, WebElement bar) {
        for (String each : input) {
            bar.clear();
            bar.sendKeys(each);
            button_submit.click();

        }


    }

    //this method check if String List with elements - have same number of elements as table.
    public boolean inputs_displayed(List<String> inputs, List<WebElement> table) {
        table.removeIf(p -> p.getText().equals("Data") || p.getText().equals("Description") || p.getText().equals("Withdrawal") || p.getText().equals("Deposit"));

        return table.size() == inputs.size();
    }

    public int index_of_balance_0(List<String> balance) {
        Integer num = -1;
        int index = 0;
        for (String each : balance) {
            num = Integer.parseInt(each);
            if (num == 0) {
                index = balance.indexOf(each);
            }
        }

        return index;
    }

    //second method after "table_take_inputs" get used

    public List<WebElement> account_0_filter(List<String> inputs, List<WebElement> t_links, String return_type) {
        List<WebElement> result = new ArrayList<>();
        Map<String, WebElement> filter = new LinkedHashMap<>();
//to make this method work with maps correctly: i can add filter.put(i+"."+inputs.get(i), t_links.get(i));
        for (int i = 0; i < inputs.size(); i++) {
            filter.put(inputs.get(i), t_links.get(i));
        }

        switch (return_type) {
            case "true":
                filter.remove("$0");
                filter.remove(null);

                for (WebElement value : filter.values()) {
                    result.add(value);
                }
                return result;


            case "false":
filter.keySet().removeIf(p->!p.equals("$0"));
                for (WebElement value : filter.values()) {
                    result.add(value);
                }
                return result;

            default: throw new NoSuchElementException("Input type - true will delete 0 balance accounts. false - will delete all not 0 accounts");
        }
    }

    public List<WebElement> dropdownOptions(WebElement dropdown){
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();

return options;
    }

    public WebElement dropdownChooseOption(WebElement dropdown,String option){
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        WebElement result = select.getFirstSelectedOption();
        for (WebElement element : options) {
            if(element.getText().equalsIgnoreCase(option)){
                result = element;
            }
        }
        return result;
    }
    public WebElement dropdownChooseOption(WebElement dropdown,int optionIndex){
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();


        return options.get(optionIndex);
    }

    public WebElement inputBar(String inputBar){
        switch (inputBar) {
            case "description" : return find_transaction_Description;
            case "dataT" : return find_transaction_ToData;
            case "dataF": return find_transaction_FromData;
            case "amountF":return find_transaction_FromAmount;
            case "amountT":return find_transaction_ToAmount;
            default: throw new RuntimeException("Can't find needed input Bar");
        }

    }


   public List<String> table_take_inputs_filter(List<WebElement> t_elements, String filter,String input) {
       List<String> result = new ArrayList<>();


       t_elements.removeIf(p -> p.getText().equals("Data") || p.getText().equals("Account") || p.getText().equals("Balance") || p.getText().equals("Description") || p.getText().equals("Withdrawal") || p.getText().equals("Deposit")
       );
       if (filter.equalsIgnoreCase("any")) {
           if (input.equalsIgnoreCase("data")) {
               for (int i = 0; i < t_elements.size(); ) {
                   result.add(t_elements.get(i).getText());
                   i += 4;
               }


           } else if (input.equalsIgnoreCase("description")) {
               for (int i = 1; i < t_elements.size(); ) {
                   result.add(t_elements.get(i).getText());
                   i += 4;
               }


           } else if (input.equalsIgnoreCase("deposit")) {
               for (int i = 2; i < t_elements.size(); ) {
                   result.add(t_elements.get(i).getText());
                   i += 4;
               }


           } else if (input.equalsIgnoreCase("withdrawal")) {
               for (int i = 3; i < t_elements.size(); ) {
                   result.add(t_elements.get(i).getText());
                   i += 4;
               }


           } else {
               throw new NoSuchElementException("Wrong input");
           }
       } else if (filter.equalsIgnoreCase("deposit")) {
           if (input.equalsIgnoreCase("data")) {
               for (int i = 0, d = 2; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           }


           else if (input.equalsIgnoreCase("description")) {
               for (int i = 1, d = 2; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           }



           else if (input.equalsIgnoreCase("deposit")) {
               for (int i = 2, d = 2; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           }
           //3  break;

           else if (input.equalsIgnoreCase("withdrawal")) {
               for (int i = 3, d = 2; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           } else {
               throw new NoSuchElementException("filter is not correct");
           }
       } else if (filter.equalsIgnoreCase("withdrawal")) {
           if (input.equalsIgnoreCase("data")) {
               for (int i = 0, d = 3; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           }


           else if (input.equalsIgnoreCase("description")) {
               for (int i = 1, d = 3; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           }




           else if (input.equalsIgnoreCase("deposit")) {
               for (int i = 2, d = 3; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           }


           else if (input.equalsIgnoreCase("withdrawal")) {
               for (int i = 3, d = 3; i < t_elements.size(); ) {
                   if (!(t_elements.get(d).getText().isEmpty() || t_elements.get(d).getText().isBlank())) {

                       result.add(t_elements.get(i).getText());
                   }

                   i += 4;
                   d += 4;

               }
           } else {
               throw new NoSuchElementException("filter is not correct");
           }


       }  else {
            throw new NoSuchElementException("Input filter - filter is no correct");
        }




           return result;
        }
 // method with filter
/*  public List<String> table_take_inputs_filter(List<WebElement> t_elements, String filter,String input) {
      List<String> result = new ArrayList<>();


      t_elements.removeIf(p -> p.getText().equals("Data") || p.getText().equals("Account") || p.getText().equals("Balance") || p.getText().equals("Description") || p.getText().equals("Withdrawal") || p.getText().equals("Deposit")
      );
      if (filter.equalsIgnoreCase("any")) {
          if (input.equalsIgnoreCase("data")) {
              for (int i = 0; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("description")) {
              for (int i = 1; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("deposit")) {
              for (int i = 2; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("withdrawal")) {
              for (int i = 3; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }
          } else {
              throw new NoSuchElementException("opa!");
          }
      }

      else  if (filter.equalsIgnoreCase("deposit")) {
          if (input.equalsIgnoreCase("data")) {
              for (int i = 0; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("description")) {
              for (int i = 1; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("deposit")) {
              for (int i = 2; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("withdrawal")) {
              for (int i = 3; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }
          } else {
              throw new NoSuchElementException("opa!");
          }
      }
//withdrawal
      else  if (filter.equalsIgnoreCase("withdrawal")) {
          if (input.equalsIgnoreCase("data")) {
              for (int i = 0; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("description")) {
              for (int i = 1; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("deposit")) {
              for (int i = 2; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }


          } else if (input.equalsIgnoreCase("withdrawal")) {
              for (int i = 3; i < t_elements.size(); ) {
                  result.add(t_elements.get(i).getText());
                  i += 4;
              }
          } else {
              throw new NoSuchElementException("opa!");
          }
      }







      else {
          throw new NoSuchElementException("Input filter - filter is no correct");
      }




      return result;
  } //this is works but i need to setting it.
*/

    public boolean element_is_visable(WebElement element){
        boolean visable = true;
        try {
           element.isDisplayed();


        }catch (Exception e){
visable = false;
        }

        return visable;
    }

    public boolean numerical (String word) {
        for (char c : word.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return false;
            }


        }
        return true;
    }

    //table_rows
public String account_from_dropdown_information(WebElement dropdown, int index){
   Select select = new Select(dropdown);
   String result ="";

   List<WebElement> options = select.getOptions();

 return result = options.get(index).getText();

//result=result.substring(0,result.indexOf("("))+" "+result.substring(result.indexOf("$"+2),result.lastIndexOf(")"));

    }


}



