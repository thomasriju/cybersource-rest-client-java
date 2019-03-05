/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiException;
import Model.PtsV2PayoutsPost201Response;
import Model.PtsV2PayoutsPost400Response;
import Model.PtsV2PayoutsPost502Response;
import Model.PtsV2PayoutsPostResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProcessAPayoutApi
 */
@Ignore
public class ProcessAPayoutApiTest {

    private final ProcessAPayoutApi api = new ProcessAPayoutApi();

    
    /**
     * Process a Payout
     *
     * Send funds from a selected funding source to a designated credit/debit card account or a prepaid card using an Original Credit Transaction (OCT). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void octCreatePaymentTest() throws ApiException {
        PtsV2PayoutsPostResponse octCreatePaymentRequest = null;
        PtsV2PayoutsPost201Response response = api.octCreatePayment(octCreatePaymentRequest);

        // TODO: test validations
    }
    
}
