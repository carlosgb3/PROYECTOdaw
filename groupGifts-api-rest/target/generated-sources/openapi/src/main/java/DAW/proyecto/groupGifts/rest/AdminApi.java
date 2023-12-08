/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package DAW.proyecto.groupGifts.rest;

import DAW.proyecto.groupGifts.dto.AdminDto;
import DAW.proyecto.groupGifts.dto.CreateAdminDto;
import DAW.proyecto.groupGifts.dto.PartialUpdateAdminDto;
import DAW.proyecto.groupGifts.dto.UpdateAdminDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-11T20:19:36.138872500+01:00[Europe/Madrid]")
@Validated
@Tag(name = "admin-controller", description = "the admin-controller API")
public interface AdminApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /admin
     *
     * @param createAdminDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createAdmin",
        tags = { "admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AdminDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/admin",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AdminDto> createAdmin(
        @Parameter(name = "CreateAdminDto", description = "", required = true) @Valid @RequestBody CreateAdminDto createAdminDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pass\" : \"pass\", \"nick_name\" : \"nick_name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /admin/filter
     *
     * @param nickName  (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "findAdmins",
        tags = { "admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AdminDto.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/admin/filter",
        produces = { "application/json" }
    )
    default ResponseEntity<List<AdminDto>> findAdmins(
        @Parameter(name = "nick_name", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "nick_name", required = false) String nickName
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"pass\" : \"pass\", \"nick_name\" : \"nick_name\", \"id\" : 0 }, { \"pass\" : \"pass\", \"nick_name\" : \"nick_name\", \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /admin/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getAdmin",
        tags = { "admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AdminDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/admin/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<AdminDto> getAdmin(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pass\" : \"pass\", \"nick_name\" : \"nick_name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /admin/{id}
     *
     * @param id  (required)
     * @param partialUpdateAdminDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateAdmin",
        tags = { "admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AdminDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/admin/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AdminDto> partialUpdateAdmin(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "PartialUpdateAdminDto", description = "", required = true) @Valid @RequestBody PartialUpdateAdminDto partialUpdateAdminDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pass\" : \"pass\", \"nick_name\" : \"nick_name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /admin/{id}
     *
     * @param id  (required)
     * @return No Content (status code 204)
     */
    @Operation(
        operationId = "removeAdmin",
        tags = { "admin-controller" },
        responses = {
            @ApiResponse(responseCode = "204", description = "No Content", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AdminDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/admin/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<AdminDto> removeAdmin(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pass\" : \"pass\", \"nick_name\" : \"nick_name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /admin/{id}
     *
     * @param id  (required)
     * @param updateAdminDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateAdmin",
        tags = { "admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AdminDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/admin/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AdminDto> updateAdmin(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "UpdateAdminDto", description = "", required = true) @Valid @RequestBody UpdateAdminDto updateAdminDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pass\" : \"pass\", \"nick_name\" : \"nick_name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}