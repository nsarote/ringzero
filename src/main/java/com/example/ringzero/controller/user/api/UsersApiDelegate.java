package com.example.ringzero.controller.user.api;

import com.example.ringzero.controller.ApiUtil;
import com.example.ringzero.controller.user.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-07T14:06:14.144539400+07:00[Asia/Bangkok]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /users/{seed} : Get User Info by Seed
     * Retrieve the information of the user with the matching seed.
     *
     * @param seed  (required)
     * @return User Found (status code 200)
     *         or User Not Found (status code 404)
     * @see UsersApi#getUserBySeed
     */
    default ResponseEntity<Result> getUser(HttpServletRequest req) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"results\" : [ { \"nat\" : \"nat\", \"gender\" : \"gender\", \"phone\" : \"phone\", \"dob\" : { \"date\" : \"date\", \"age\" : 6 }, \"name\" : { \"last\" : \"last\", \"title\" : \"title\", \"first\" : \"first\" }, \"registered\" : { \"date\" : \"date\", \"age\" : 1 }, \"location\" : { \"country\" : \"country\", \"city\" : \"city\", \"street\" : { \"number\" : 0, \"name\" : \"name\" }, \"timezone\" : { \"offset\" : \"offset\", \"description\" : \"description\" }, \"postcode\" : \"postcode\", \"coordinates\" : { \"latitude\" : \"latitude\", \"longitude\" : \"longitude\" }, \"state\" : \"state\" }, \"id\" : { \"name\" : \"name\", \"value\" : \"value\" }, \"login\" : { \"sha1\" : \"sha1\", \"password\" : \"password\", \"salt\" : \"salt\", \"sha256\" : \"sha256\", \"uuid\" : \"uuid\", \"username\" : \"username\", \"md5\" : \"md5\" }, \"cell\" : \"cell\", \"email\" : \"email\", \"picture\" : { \"thumbnail\" : \"thumbnail\", \"large\" : \"large\", \"medium\" : \"medium\" } }, { \"nat\" : \"nat\", \"gender\" : \"gender\", \"phone\" : \"phone\", \"dob\" : { \"date\" : \"date\", \"age\" : 6 }, \"name\" : { \"last\" : \"last\", \"title\" : \"title\", \"first\" : \"first\" }, \"registered\" : { \"date\" : \"date\", \"age\" : 1 }, \"location\" : { \"country\" : \"country\", \"city\" : \"city\", \"street\" : { \"number\" : 0, \"name\" : \"name\" }, \"timezone\" : { \"offset\" : \"offset\", \"description\" : \"description\" }, \"postcode\" : \"postcode\", \"coordinates\" : { \"latitude\" : \"latitude\", \"longitude\" : \"longitude\" }, \"state\" : \"state\" }, \"id\" : { \"name\" : \"name\", \"value\" : \"value\" }, \"login\" : { \"sha1\" : \"sha1\", \"password\" : \"password\", \"salt\" : \"salt\", \"sha256\" : \"sha256\", \"uuid\" : \"uuid\", \"username\" : \"username\", \"md5\" : \"md5\" }, \"cell\" : \"cell\", \"email\" : \"email\", \"picture\" : { \"thumbnail\" : \"thumbnail\", \"large\" : \"large\", \"medium\" : \"medium\" } } ], \"info\" : { \"seed\" : \"seed\", \"page\" : 5, \"results\" : 5, \"version\" : \"version\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
