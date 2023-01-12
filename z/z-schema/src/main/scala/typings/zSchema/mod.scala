package typings.zSchema

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("z-schema", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Validator {
    def this(options: Options) = this()
  }
  @JSImport("z-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getDefaultOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[Options]
  
  /**
    * Get the list of all registered formats.
    *
    * Both the names of the burned-in formats and the custom format names are
    * returned by this function.
    *
    * @returns {string[]} the list of all registered format names.
    */
  /* static member */
  inline def getRegisteredFormats(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredFormats")().asInstanceOf[js.Array[String]]
  
  @JSImport("z-schema", "jsonSymbol")
  @js.native
  val jsonSymbol: js.Symbol = js.native
  
  /**
    * Register a custom format.
    *
    * @param name - name of the custom format
    * @param validatorFunction - custom format validator function.
    *   Returns `true` if `value` matches the custom format.
    */
  /* static member */
  inline def registerFormat(formatName: String, validatorFunction: js.Function1[/* value */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFormat")(formatName.asInstanceOf[js.Any], validatorFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("z-schema", "schemaSymbol")
  @js.native
  val schemaSymbol: js.Symbol = js.native
  
  /**
    * Unregister a format.
    *
    * @param name - name of the custom format
    */
  /* static member */
  inline def unregisterFormat(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterFormat")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var assumeAdditional: js.UndefOr[Boolean] = js.undefined
    
    var asyncTimeout: js.UndefOr[Double] = js.undefined
    
    var breakOnFirstError: js.UndefOr[Boolean] = js.undefined
    
    var customValidator: js.UndefOr[js.Function3[/* report */ Report, /* schema */ Any, /* json */ Any, Unit]] = js.undefined
    
    var forceAdditional: js.UndefOr[Boolean] = js.undefined
    
    var forceItems: js.UndefOr[Boolean] = js.undefined
    
    var forceMaxItems: js.UndefOr[Boolean] = js.undefined
    
    var forceMaxLength: js.UndefOr[Boolean] = js.undefined
    
    var forceMinItems: js.UndefOr[Boolean] = js.undefined
    
    var forceMinLength: js.UndefOr[Boolean] = js.undefined
    
    var forceProperties: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUnknownFormats: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUnresolvableReferences: js.UndefOr[Boolean] = js.undefined
    
    var noEmptyArrays: js.UndefOr[Boolean] = js.undefined
    
    var noEmptyStrings: js.UndefOr[Boolean] = js.undefined
    
    var noExtraKeywords: js.UndefOr[Boolean] = js.undefined
    
    var noTypeless: js.UndefOr[Boolean] = js.undefined
    
    var pedanticCheck: js.UndefOr[Boolean] = js.undefined
    
    var reportPathAsArray: js.UndefOr[Boolean] = js.undefined
    
    var strictMode: js.UndefOr[Boolean] = js.undefined
    
    var strictUris: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAssumeAdditional(value: Boolean): Self = StObject.set(x, "assumeAdditional", value.asInstanceOf[js.Any])
      
      inline def setAssumeAdditionalUndefined: Self = StObject.set(x, "assumeAdditional", js.undefined)
      
      inline def setAsyncTimeout(value: Double): Self = StObject.set(x, "asyncTimeout", value.asInstanceOf[js.Any])
      
      inline def setAsyncTimeoutUndefined: Self = StObject.set(x, "asyncTimeout", js.undefined)
      
      inline def setBreakOnFirstError(value: Boolean): Self = StObject.set(x, "breakOnFirstError", value.asInstanceOf[js.Any])
      
      inline def setBreakOnFirstErrorUndefined: Self = StObject.set(x, "breakOnFirstError", js.undefined)
      
      inline def setCustomValidator(value: (/* report */ Report, /* schema */ Any, /* json */ Any) => Unit): Self = StObject.set(x, "customValidator", js.Any.fromFunction3(value))
      
      inline def setCustomValidatorUndefined: Self = StObject.set(x, "customValidator", js.undefined)
      
      inline def setForceAdditional(value: Boolean): Self = StObject.set(x, "forceAdditional", value.asInstanceOf[js.Any])
      
      inline def setForceAdditionalUndefined: Self = StObject.set(x, "forceAdditional", js.undefined)
      
      inline def setForceItems(value: Boolean): Self = StObject.set(x, "forceItems", value.asInstanceOf[js.Any])
      
      inline def setForceItemsUndefined: Self = StObject.set(x, "forceItems", js.undefined)
      
      inline def setForceMaxItems(value: Boolean): Self = StObject.set(x, "forceMaxItems", value.asInstanceOf[js.Any])
      
      inline def setForceMaxItemsUndefined: Self = StObject.set(x, "forceMaxItems", js.undefined)
      
      inline def setForceMaxLength(value: Boolean): Self = StObject.set(x, "forceMaxLength", value.asInstanceOf[js.Any])
      
      inline def setForceMaxLengthUndefined: Self = StObject.set(x, "forceMaxLength", js.undefined)
      
      inline def setForceMinItems(value: Boolean): Self = StObject.set(x, "forceMinItems", value.asInstanceOf[js.Any])
      
      inline def setForceMinItemsUndefined: Self = StObject.set(x, "forceMinItems", js.undefined)
      
      inline def setForceMinLength(value: Boolean): Self = StObject.set(x, "forceMinLength", value.asInstanceOf[js.Any])
      
      inline def setForceMinLengthUndefined: Self = StObject.set(x, "forceMinLength", js.undefined)
      
      inline def setForceProperties(value: Boolean): Self = StObject.set(x, "forceProperties", value.asInstanceOf[js.Any])
      
      inline def setForcePropertiesUndefined: Self = StObject.set(x, "forceProperties", js.undefined)
      
      inline def setIgnoreUnknownFormats(value: Boolean): Self = StObject.set(x, "ignoreUnknownFormats", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownFormatsUndefined: Self = StObject.set(x, "ignoreUnknownFormats", js.undefined)
      
      inline def setIgnoreUnresolvableReferences(value: Boolean): Self = StObject.set(x, "ignoreUnresolvableReferences", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnresolvableReferencesUndefined: Self = StObject.set(x, "ignoreUnresolvableReferences", js.undefined)
      
      inline def setNoEmptyArrays(value: Boolean): Self = StObject.set(x, "noEmptyArrays", value.asInstanceOf[js.Any])
      
      inline def setNoEmptyArraysUndefined: Self = StObject.set(x, "noEmptyArrays", js.undefined)
      
      inline def setNoEmptyStrings(value: Boolean): Self = StObject.set(x, "noEmptyStrings", value.asInstanceOf[js.Any])
      
      inline def setNoEmptyStringsUndefined: Self = StObject.set(x, "noEmptyStrings", js.undefined)
      
      inline def setNoExtraKeywords(value: Boolean): Self = StObject.set(x, "noExtraKeywords", value.asInstanceOf[js.Any])
      
      inline def setNoExtraKeywordsUndefined: Self = StObject.set(x, "noExtraKeywords", js.undefined)
      
      inline def setNoTypeless(value: Boolean): Self = StObject.set(x, "noTypeless", value.asInstanceOf[js.Any])
      
      inline def setNoTypelessUndefined: Self = StObject.set(x, "noTypeless", js.undefined)
      
      inline def setPedanticCheck(value: Boolean): Self = StObject.set(x, "pedanticCheck", value.asInstanceOf[js.Any])
      
      inline def setPedanticCheckUndefined: Self = StObject.set(x, "pedanticCheck", js.undefined)
      
      inline def setReportPathAsArray(value: Boolean): Self = StObject.set(x, "reportPathAsArray", value.asInstanceOf[js.Any])
      
      inline def setReportPathAsArrayUndefined: Self = StObject.set(x, "reportPathAsArray", js.undefined)
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
      
      inline def setStrictUris(value: Boolean): Self = StObject.set(x, "strictUris", value.asInstanceOf[js.Any])
      
      inline def setStrictUrisUndefined: Self = StObject.set(x, "strictUris", js.undefined)
    }
  }
  
  /**
    * Basic representation of the Report class -- just enough to support customValidator
    */
  trait Report extends StObject {
    
    /**
      * @param errorCode - a string representing the code for the custom error, e.g. INVALID_VALUE_SET
      * @param errorMessage - string with the message to be returned in the error
      * @param params - an array of relevant params for the error, e.g. [fieldName, fieldValue]
      * @param subReports - sub-schema involved in the error
      * @param schemaDescription - description from the schema used in the validation
      * Adds custom error to the errors array in the validation instance and sets valid to false if it is not already set as false
      */
    def addCustomError(
      errorCode: String,
      errorMessage: String,
      params: js.Array[String],
      subReports: String,
      schemaDescription: String
    ): Unit
    
    var errors: js.Array[SchemaErrorDetail]
    
    /**
      * Returns whether the validation did pass
      */
    def isValid(): Boolean
  }
  object Report {
    
    inline def apply(
      addCustomError: (String, String, js.Array[String], String, String) => Unit,
      errors: js.Array[SchemaErrorDetail],
      isValid: () => Boolean
    ): Report = {
      val __obj = js.Dynamic.literal(addCustomError = js.Any.fromFunction5(addCustomError), errors = errors.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid))
      __obj.asInstanceOf[Report]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
      
      inline def setAddCustomError(value: (String, String, js.Array[String], String, String) => Unit): Self = StObject.set(x, "addCustomError", js.Any.fromFunction5(value))
      
      inline def setErrors(value: js.Array[SchemaErrorDetail]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: SchemaErrorDetail*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    }
  }
  
  trait SchemaError
    extends StObject
       with Error {
    
    /**
      * Returns details for each error that occurred during validation.
      * See Options.breakOnFirstError.
      */
    var details: js.Array[SchemaErrorDetail]
  }
  object SchemaError {
    
    inline def apply(details: js.Array[SchemaErrorDetail], message: String, name: String): SchemaError = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaError] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: js.Array[SchemaErrorDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: SchemaErrorDetail*): Self = StObject.set(x, "details", js.Array(value*))
    }
  }
  
  trait SchemaErrorDetail extends StObject {
    
    /**
      * An error identifier that can be used to format a custom error message.
      * Example: "INVALID_TYPE"
      */
    var code: String
    
    /**
      * The schema rule description, which is included for certain errors where
      * this information is useful (e.g. to describe a constraint).
      */
    var description: String
    
    /**
      * Returns details for sub-schemas that failed to match.  For example, if the schema
      * uses the "oneOf" constraint to accept several alternative possibilities, each
      * alternative will have its own inner detail object explaining why it failed to match.
      */
    var inner: js.Array[SchemaErrorDetail]
    
    /**
      * Example: "Expected type string but found type array"
      */
    var message: String
    
    /**
      * Format parameters that can be used to format a custom error message.
      * Example: ["string","array"]
      */
    var params: js.Array[String]
    
    /**
      * A JSON path indicating the location of the error.
      * Example: "#/projects/1"
      */
    var path: String
  }
  object SchemaErrorDetail {
    
    inline def apply(
      code: String,
      description: String,
      inner: js.Array[SchemaErrorDetail],
      message: String,
      params: js.Array[String],
      path: String
    ): SchemaErrorDetail = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaErrorDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaErrorDetail] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setInner(value: js.Array[SchemaErrorDetail]): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerVarargs(value: SchemaErrorDetail*): Self = StObject.set(x, "inner", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Validator extends StObject {
    
    /**
      * Returns an Error object for the most recent failed validation, or null if the validation was successful.
      */
    def getLastError(): SchemaError = js.native
    
    /**
      * Returns the error details for the most recent validation, or undefined if the validation was successful.
      * This is the same list as the SchemaError.details property.
      */
    def getLastErrors(): js.Array[SchemaErrorDetail] = js.native
    
    var lastReport: js.UndefOr[Report] = js.native
    
    /**
      * @param json - either a JSON string or a parsed JSON object
      * @param schema - the JSON object representing the schema
      * @returns true if json matches schema
      */
    def validate(json: Any, schema: Any): Boolean = js.native
    /**
      * @param json - either a JSON string or a parsed JSON object
      * @param schema - the JSON object representing the schema
      */
    def validate(json: Any, schema: Any, callback: js.Function2[/* err */ Any, /* valid */ Boolean, Unit]): Unit = js.native
    
    /**
      * @param schema - JSON object representing schema
      * @returns {boolean} true if schema is valid.
      */
    def validateSchema(schema: Any): Boolean = js.native
  }
}
