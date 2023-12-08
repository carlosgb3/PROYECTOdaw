/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package DAW.proyecto.groupGifts.rest;

import DAW.proyecto.groupGifts.dto.CreateGiverDto;
import DAW.proyecto.groupGifts.dto.GiverDto;
import DAW.proyecto.groupGifts.dto.PartialUpdateGiverDto;
import DAW.proyecto.groupGifts.dto.UpdateGiverDto;
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
@Tag(name = "giver-controller", description = "the giver-controller API")
public interface GiverApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /giver
     *
     * @param createGiverDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createGiver",
        tags = { "giver-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GiverDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/giver",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<GiverDto> createGiver(
        @Parameter(name = "CreateGiverDto", description = "", required = true) @Valid @RequestBody CreateGiverDto createGiverDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : \"surname\", \"name\" : \"name\", \"gift_id\" : 6, \"contribution_id\" : 1, \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /giver/filter
     *
     * @param id  (optional)
     * @param type  (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "findGivers",
        tags = { "giver-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GiverDto.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/giver/filter",
        produces = { "application/json" }
    )
    default ResponseEntity<List<GiverDto>> findGivers(
        @Parameter(name = "id", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "id", required = false) Long id,
        @Parameter(name = "type", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "type", required = false) String type
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"surname\" : \"surname\", \"name\" : \"name\", \"gift_id\" : 6, \"contribution_id\" : 1, \"id\" : 0, \"email\" : \"email\" }, { \"surname\" : \"surname\", \"name\" : \"name\", \"gift_id\" : 6, \"contribution_id\" : 1, \"id\" : 0, \"email\" : \"email\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /giver/{id}
     *
     * @param id  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getGiver",
        tags = { "giver-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GiverDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/giver/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<GiverDto> getGiver(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : \"surname\", \"name\" : \"name\", \"gift_id\" : 6, \"contribution_id\" : 1, \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /giver/{id}
     *
     * @param id  (required)
     * @param partialUpdateGiverDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "partialUpdateGiver",
        tags = { "giver-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GiverDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/giver/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<GiverDto> partialUpdateGiver(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "PartialUpdateGiverDto", description = "", required = true) @Valid @RequestBody PartialUpdateGiverDto partialUpdateGiverDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : \"surname\", \"name\" : \"name\", \"gift_id\" : 6, \"contribution_id\" : 1, \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /giver/{id}
     *
     * @param id  (required)
     * @return No Content (status code 204)
     */
    @Operation(
        operationId = "removeGiver",
        tags = { "giver-controller" },
        responses = {
            @ApiResponse(responseCode = "204", description = "No Content", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GiverDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/giver/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<GiverDto> removeGiver(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : \"surname\", \"name\" : \"name\", \"gift_id\" : 6, \"contribution_id\" : 1, \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /giver/{id}
     *
     * @param id  (required)
     * @param updateGiverDto  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateGiver",
        tags = { "giver-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GiverDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/giver/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<GiverDto> updateGiver(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "UpdateGiverDto", description = "", required = true) @Valid @RequestBody UpdateGiverDto updateGiverDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"surname\" : \"surname\", \"name\" : \"name\", \"gift_id\" : 6, \"contribution_id\" : 1, \"id\" : 0, \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
