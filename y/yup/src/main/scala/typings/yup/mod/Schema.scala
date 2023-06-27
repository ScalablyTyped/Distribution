package typings.yup.mod

import typings.std.Record
import typings.yup.anon.FnCall
import typings.yup.anon.PartialSchemaSpecany
import typings.yup.anon.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("yup", "Schema")
@js.native
open class Schema[TType, TContext, TDefault, TFlags /* <: Flags */] protected ()
  extends StObject
     with ISchema[TType, TContext, TFlags, TDefault] {
  def this(options: SchemaOptions[TType, Any]) = this()
  
  def default(`def`: DefaultThunk[Any, Any]): Any = js.native
  
  val __isYupSchema__ : Boolean = js.native
  
  @JSName("__outputType")
  val __outputType_Schema: ResolveFlags[TType, TFlags, TDefault] = js.native
  
  /* protected */ var _blacklist: ReferenceSet = js.native
  
  /* protected */ def _cast(rawValue: Any, options: CastOptions1[TContext]): Any = js.native
  
  /* protected */ def _getDefault(): Any = js.native
  /* protected */ def _getDefault(options: ResolveOptions[TContext]): Any = js.native
  
  /* private */ var _mutate: Any = js.native
  
  def _type: String = js.native
  
  /* protected */ def _typeCheck(value: Any): /* is std.NonNullable<TType> */ Boolean = js.native
  
  /* protected */ def _validate(
    _value: Any,
    options: Unit,
    panic: js.Function2[/* err */ js.Error, /* value */ Any, Unit],
    next: js.Function2[/* err */ js.Array[ValidationError], /* value */ Any, Unit]
  ): Unit = js.native
  /* protected */ def _validate(
    _value: Any,
    options: InternalOptions[TContext],
    panic: js.Function2[/* err */ js.Error, /* value */ Any, Unit],
    next: js.Function2[/* err */ js.Array[ValidationError], /* value */ Any, Unit]
  ): Unit = js.native
  
  /* protected */ var _whitelist: ReferenceSet = js.native
  
  def clone(spec: PartialSchemaSpecany): this.type = js.native
  
  def concat(schema: this.type): this.type = js.native
  @JSName("concat")
  def concat_AnySchema(schema: AnySchema[Any, Any, Any, Flags]): AnySchema[Any, Any, Any, Flags] = js.native
  
  /* private */ var conditions: Any = js.native
  
  def defined(): Any = js.native
  def defined(message: Message[Any]): Any = js.native
  
  val deps: js.Array[String] = js.native
  
  def equals(enums: js.Array[Any | Reference[Any]], message: Message[Values]): Any = js.native
  def equals[U /* <: Any */](enums: js.Array[U | Reference[Any]]): this.type = js.native
  @JSName("equals")
  var equals_Original: FnCall = js.native
  @JSName("equals")
  def equals_U_This[U /* <: Any */](enums: js.Array[U | Reference[Any]], message: Message[Values]): this.type = js.native
  
  /* protected */ var exclusiveTests: Record[String, Boolean] = js.native
  
  def getDefault(): TDefault = js.native
  def getDefault(options: ResolveOptions[TContext]): TDefault = js.native
  
  /* private */ var internalTests: Any = js.native
  
  def is(enums: js.Array[Any | Reference[Any]], message: Message[Values]): Any = js.native
  def is[U /* <: Any */](enums: js.Array[U | Reference[Any]]): this.type = js.native
  
  def isType(v: Any): /* is TType */ Boolean = js.native
  
  def isValid(value: Any): js.Promise[Boolean] = js.native
  def isValid(value: Any, options: ValidateOptions[TContext]): js.Promise[Boolean] = js.native
  
  def isValidSync(value: Any): Boolean = js.native
  def isValidSync(value: Any, options: ValidateOptions[TContext]): Boolean = js.native
  
  @JSName("is")
  var is_Original: FnCall = js.native
  @JSName("is")
  def is_U_This[U /* <: Any */](enums: js.Array[U | Reference[Any]], message: Message[Values]): this.type = js.native
  
  def label(label: String): this.type = js.native
  
  def meta(): js.UndefOr[Record[String, Any]] = js.native
  def meta(obj: Record[String, Any]): this.type = js.native
  
  def nonNullable(): Any = js.native
  def nonNullable(message: Message[Any]): Any = js.native
  
  def nope[U /* <: Any */](enums: js.Array[Maybe[U] | Reference[Any]]): this.type = js.native
  def nope[U /* <: Any */](enums: js.Array[Maybe[U] | Reference[Any]], message: Message[Values]): this.type = js.native
  @JSName("nope")
  var nope_Original: js.Function2[
    /* enums */ js.Array[Maybe[Any] | Reference[Any]], 
    /* message */ js.UndefOr[Message[Values]], 
    this.type
  ] = js.native
  
  def not[U /* <: Any */](enums: js.Array[Maybe[U] | Reference[Any]]): this.type = js.native
  def not[U /* <: Any */](enums: js.Array[Maybe[U] | Reference[Any]], message: Message[Values]): this.type = js.native
  
  def notOneOf[U /* <: TType */](enums: js.Array[Maybe[U] | Reference[Any]]): this.type = js.native
  def notOneOf[U /* <: TType */](enums: js.Array[Maybe[U] | Reference[Any]], message: Message[Values]): this.type = js.native
  
  def notRequired(): Any = js.native
  
  @JSName("not")
  var not_Original: js.Function2[
    /* enums */ js.Array[Maybe[Any] | Reference[Any]], 
    /* message */ js.UndefOr[Message[Values]], 
    this.type
  ] = js.native
  
  /* protected */ def nullability(nullable: Boolean): this.type = js.native
  /* protected */ def nullability(nullable: Boolean, message: Message[Any]): this.type = js.native
  
  def nullable(): Any = js.native
  
  def oneOf(enums: js.Array[TType | Reference[Any]], message: Message[Values]): Any = js.native
  def oneOf[U /* <: TType */](enums: js.Array[U | Reference[Any]]): this.type = js.native
  @JSName("oneOf")
  def oneOf_U_This[U /* <: TType */](enums: js.Array[U | Reference[Any]], message: Message[Values]): this.type = js.native
  
  def optional(): Any = js.native
  
  /* protected */ def optionality(optional: Boolean): this.type = js.native
  /* protected */ def optionality(optional: Boolean, message: Message[Any]): this.type = js.native
  
  def required(): Any = js.native
  def required(message: Message[Any]): Any = js.native
  
  /* protected */ def resolveOptions[T /* <: InternalOptions[Any] */](options: T): T = js.native
  
  /**
    * Executes a set of validations, either schema, produced Tests or a nested
    * schema validate result.
    */
  /* protected */ def runTests(
    runOptions: TestRunOptions,
    panic: js.Function2[/* err */ js.Error, /* value */ Any, Unit],
    next: js.Function2[/* errors */ js.Array[ValidationError], /* value */ Any, Unit]
  ): Unit = js.native
  
  var spec: SchemaSpec[Any] = js.native
  
  def strict(): this.type = js.native
  def strict(isStrict: Boolean): this.type = js.native
  
  def strip(): Any = js.native
  def strip(strip: Boolean): Any = js.native
  
  @JSName("test")
  def test_outputType(
    name: String,
    message: Message[Any],
    test: TestFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: this['__outputType'] */ js.Any, 
      TContext
    ]
  ): this.type = js.native
  @JSName("test")
  def test_outputType(
    name: String,
    test: TestFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: this['__outputType'] */ js.Any, 
      TContext
    ]
  ): this.type = js.native
  /**
    * Adds a test function to the schema's queue of tests.
    * tests can be exclusive or non-exclusive.
    *
    * - exclusive tests, will replace any existing tests of the same name.
    * - non-exclusive: can be stacked
    *
    * If a non-exclusive test is added to a schema with an exclusive test of the same name
    * the exclusive test is removed and further tests of the same name will be stacked.
    *
    * If an exclusive test is added to a schema with non-exclusive tests of the same name
    * the previous tests are removed and further tests of the same name will replace each other.
    */
  @JSName("test")
  def test_outputType(
    options: TestConfig[
      /* import warning: importer.ImportType#apply Failed type conversion: this['__outputType'] */ js.Any, 
      TContext
    ]
  ): this.type = js.native
  @JSName("test")
  def test_outputType(
    test: TestFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: this['__outputType'] */ js.Any, 
      TContext
    ]
  ): this.type = js.native
  
  var tests: js.Array[Test] = js.native
  
  def transform(fn: TransformFunction[this.type]): this.type = js.native
  
  var transforms: js.Array[TransformFunction[AnySchema[Any, Any, Any, Flags]]] = js.native
  
  val `type`: String = js.native
  
  def typeError(message: Message[Any]): this.type = js.native
  
  def validateAt(path: String, value: Any): js.Promise[Any] = js.native
  def validateAt(path: String, value: Any, options: ValidateOptions[TContext]): js.Promise[Any] = js.native
  
  def validateSync(value: Any): /* import warning: importer.ImportType#apply Failed type conversion: this['__outputType'] */ js.Any = js.native
  def validateSync(value: Any, options: ValidateOptions[TContext]): /* import warning: importer.ImportType#apply Failed type conversion: this['__outputType'] */ js.Any = js.native
  
  def validateSyncAt(path: String, value: Any): Any = js.native
  def validateSyncAt(path: String, value: Any, options: ValidateOptions[TContext]): Any = js.native
  
  def when(builder: ConditionBuilder[this.type]): this.type = js.native
  def when(keys: String, builder: ConditionBuilder[this.type]): this.type = js.native
  def when(keys: String, options: ConditionConfig[this.type]): this.type = js.native
  def when(keys: js.Array[String], builder: ConditionBuilder[this.type]): this.type = js.native
  def when(keys: js.Array[String], options: ConditionConfig[this.type]): this.type = js.native
  def when(options: ConditionConfig[this.type]): this.type = js.native
  
  def withMutation[T](fn: js.Function1[/* schema */ this.type, T]): T = js.native
}
