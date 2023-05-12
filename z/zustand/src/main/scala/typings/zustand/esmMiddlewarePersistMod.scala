package typings.zustand

import typings.std.Omit
import typings.zustand.anon.ClearStorage
import typings.zustand.esmVanillaMod.StateCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMiddlewarePersistMod {
  
  @JSImport("zustand/esm/middleware/persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createJSONStorage[S](getStorage: js.Function0[StateStorage]): js.UndefOr[PersistStorage[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStorage.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PersistStorage[S]]]
  inline def createJSONStorage[S](getStorage: js.Function0[StateStorage], options: JsonStorageOptions): js.UndefOr[PersistStorage[S]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStorage.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PersistStorage[S]]]
  
  @JSImport("zustand/esm/middleware/persist", "persist")
  @js.native
  val persist: Persist_ = js.native
  
  trait JsonStorageOptions extends StObject {
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    var reviver: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
  }
  object JsonStorageOptions {
    
    inline def apply(): JsonStorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonStorageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonStorageOptions] (val x: Self) extends AnyVal {
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setReviver(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  type PersistListener[S] = js.Function1[/* state */ S, Unit]
  
  trait PersistOptions[S, PersistedState] extends StObject {
    
    /**
      * @deprecated Use `storage` instead.
      * Use a custom deserializer.
      * Must return an object matching StorageValue<S>
      *
      * @param str The storage's current value.
      * @default JSON.parse
      */
    var deserialize: js.UndefOr[
        js.Function1[
          /* str */ String, 
          StorageValue[PersistedState] | js.Promise[StorageValue[PersistedState]]
        ]
      ] = js.undefined
    
    /**
      * @deprecated Use `storage` instead.
      * A function returning a storage.
      * The storage must fit `window.localStorage`'s api (or an async version of it).
      * For example the storage could be `AsyncStorage` from React Native.
      *
      * @default () => localStorage
      */
    var getStorage: js.UndefOr[js.Function0[StateStorage]] = js.undefined
    
    /**
      * A function to perform custom hydration merges when combining the stored state with the current one.
      * By default, this function does a shallow merge.
      */
    var merge: js.UndefOr[js.Function2[/* persistedState */ Any, /* currentState */ S, S]] = js.undefined
    
    /**
      * A function to perform persisted state migration.
      * This function will be called when persisted state versions mismatch with the one specified here.
      */
    var migrate: js.UndefOr[js.Function2[/* persistedState */ Any, /* version */ Double, S | js.Promise[S]]] = js.undefined
    
    /** Name of the storage (must be unique) */
    var name: String
    
    /**
      * A function returning another (optional) function.
      * The main function will be called before the state rehydration.
      * The returned function will be called after the state rehydration or when an error occurred.
      */
    var onRehydrateStorage: js.UndefOr[
        js.Function1[
          /* state */ S, 
          (js.Function2[/* state */ js.UndefOr[S], /* error */ js.UndefOr[Any], Unit]) | Unit
        ]
      ] = js.undefined
    
    /**
      * Filter the persisted value.
      *
      * @params state The state's value
      */
    var partialize: js.UndefOr[js.Function1[/* state */ S, PersistedState]] = js.undefined
    
    /**
      * @deprecated Use `storage` instead.
      * Use a custom serializer.
      * The returned string will be stored in the storage.
      *
      * @default JSON.stringify
      */
    var serialize: js.UndefOr[js.Function1[/* state */ StorageValue[S], String | js.Promise[String]]] = js.undefined
    
    /**
      * An optional boolean that will prevent the persist middleware from triggering hydration on initialization,
      * This allows you to call `rehydrate()` at a specific point in your apps rendering life-cycle.
      *
      * This is useful in SSR application.
      *
      * @default false
      */
    var skipHydration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use a custom persist storage.
      *
      * Combining `createJSONStorage` helps creating a persist storage
      * with JSON.parse and JSON.stringify.
      *
      * @default createJSONStorage(() => localStorage)
      */
    var storage: js.UndefOr[PersistStorage[PersistedState]] = js.undefined
    
    /**
      * If the stored state's version mismatch the one specified here, the storage will not be used.
      * This is useful when adding a breaking change to your store.
      */
    var version: js.UndefOr[Double] = js.undefined
  }
  object PersistOptions {
    
    inline def apply[S, PersistedState](name: String): PersistOptions[S, PersistedState] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistOptions[S, PersistedState]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistOptions[?, ?], S, PersistedState] (val x: Self & (PersistOptions[S, PersistedState])) extends AnyVal {
      
      inline def setDeserialize(value: /* str */ String => StorageValue[PersistedState] | js.Promise[StorageValue[PersistedState]]): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setGetStorage(value: () => StateStorage): Self = StObject.set(x, "getStorage", js.Any.fromFunction0(value))
      
      inline def setGetStorageUndefined: Self = StObject.set(x, "getStorage", js.undefined)
      
      inline def setMerge(value: (/* persistedState */ Any, /* currentState */ S) => S): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setMigrate(value: (/* persistedState */ Any, /* version */ Double) => S | js.Promise[S]): Self = StObject.set(x, "migrate", js.Any.fromFunction2(value))
      
      inline def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnRehydrateStorage(
        value: /* state */ S => (js.Function2[/* state */ js.UndefOr[S], /* error */ js.UndefOr[Any], Unit]) | Unit
      ): Self = StObject.set(x, "onRehydrateStorage", js.Any.fromFunction1(value))
      
      inline def setOnRehydrateStorageUndefined: Self = StObject.set(x, "onRehydrateStorage", js.undefined)
      
      inline def setPartialize(value: /* state */ S => PersistedState): Self = StObject.set(x, "partialize", js.Any.fromFunction1(value))
      
      inline def setPartializeUndefined: Self = StObject.set(x, "partialize", js.undefined)
      
      inline def setSerialize(value: /* state */ StorageValue[S] => String | js.Promise[String]): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setSkipHydration(value: Boolean): Self = StObject.set(x, "skipHydration", value.asInstanceOf[js.Any])
      
      inline def setSkipHydrationUndefined: Self = StObject.set(x, "skipHydration", js.undefined)
      
      inline def setStorage(value: PersistStorage[PersistedState]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PersistStorage[S] extends StObject {
    
    def getItem(name: String): StorageValue[S] | Null | (js.Promise[StorageValue[S] | Null])
    
    def removeItem(name: String): Unit | js.Promise[Unit]
    
    def setItem(name: String, value: StorageValue[S]): Unit | js.Promise[Unit]
  }
  object PersistStorage {
    
    inline def apply[S](
      getItem: String => StorageValue[S] | Null | (js.Promise[StorageValue[S] | Null]),
      removeItem: String => Unit | js.Promise[Unit],
      setItem: (String, StorageValue[S]) => Unit | js.Promise[Unit]
    ): PersistStorage[S] = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[PersistStorage[S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistStorage[?], S] (val x: Self & PersistStorage[S]) extends AnyVal {
      
      inline def setGetItem(value: String => StorageValue[S] | Null | (js.Promise[StorageValue[S] | Null])): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => Unit | js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, StorageValue[S]) => Unit | js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  type Persist_ = js.Function2[
    /* initializer */ StateCreator[
      Any, 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      js.Array[Any], 
      Any
    ], 
    /* options */ PersistOptions[Any, Any], 
    StateCreator[
      Any, 
      js.Array[Any], 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      Any
    ]
  ]
  
  trait StateStorage extends StObject {
    
    def getItem(name: String): String | Null | (js.Promise[String | Null])
    
    def removeItem(name: String): Unit | js.Promise[Unit]
    
    def setItem(name: String, value: String): Unit | js.Promise[Unit]
  }
  object StateStorage {
    
    inline def apply(
      getItem: String => String | Null | (js.Promise[String | Null]),
      removeItem: String => Unit | js.Promise[Unit],
      setItem: (String, String) => Unit | js.Promise[Unit]
    ): StateStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[StateStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateStorage] (val x: Self) extends AnyVal {
      
      inline def setGetItem(value: String => String | Null | (js.Promise[String | Null])): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => Unit | js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => Unit | js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  trait StorageValue[S] extends StObject {
    
    var state: S
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object StorageValue {
    
    inline def apply[S](state: S): StorageValue[S] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageValue[S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageValue[?], S] (val x: Self & StorageValue[S]) extends AnyVal {
      
      inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait StorePersist[S, Ps] extends StObject {
    
    var persist: ClearStorage[S, Ps]
  }
  object StorePersist {
    
    inline def apply[S, Ps](persist: ClearStorage[S, Ps]): StorePersist[S, Ps] = {
      val __obj = js.Dynamic.literal(persist = persist.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorePersist[S, Ps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorePersist[?, ?], S, Ps] (val x: Self & (StorePersist[S, Ps])) extends AnyVal {
      
      inline def setPersist(value: ClearStorage[S, Ps]): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends {getState (): infer T} ? zustand.zustand/esm/middleware/persist.Write<S, zustand.zustand/esm/middleware/persist.StorePersist<T, A>> : never
    }}}
    */
  @js.native
  trait WithPersist[S, A] extends StObject
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  /* augmented module */
  object zustandEsmVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/persist")
      var zustandSlashpersist: WithPersist[S, A]
    }
    object StoreMutators {
      
      inline def apply[S, A](zustandSlashpersist: WithPersist[S, A]): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/persist")(zustandSlashpersist.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StoreMutators[?, ?], S, A] (val x: Self & (StoreMutators[S, A])) extends AnyVal {
        
        inline def setZustandSlashpersist(value: WithPersist[S, A]): Self = StObject.set(x, "zustand/persist", value.asInstanceOf[js.Any])
      }
    }
  }
}
