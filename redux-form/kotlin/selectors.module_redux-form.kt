@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

typealias DataSelector<FormData, State> = (formName: String, getFormState: GetFormState) -> (state: State) -> FormData

typealias ErrorSelector<FormData, State, ErrorType> = (formName: String, getFormState: GetFormState) -> (state: State) -> FormErrors<FormData, ErrorType>

typealias BooleanSelector<State> = (formName: String, getFormState: GetFormState) -> (state: State) -> Boolean

typealias NamesSelector<State> = (getFormState: GetFormState) -> (state: State) -> Array<String>

typealias FormOrFieldsBooleanSelector<State> = (formName: String, getFormState: GetFormState) -> (state: State, fields: String) -> Boolean

external var getFormValues: DataSelector

external var getFormInitialValues: DataSelector

external var getFormSyncErrors: ErrorSelector

external var getFormMeta: DataSelector

external var getFormAsyncErrors: ErrorSelector

external var getFormSyncWarnings: ErrorSelector

external var getFormSubmitErrors: ErrorSelector

external var getFormError: ErrorSelector

external var getFormNames: NamesSelector

external var isDirty: FormOrFieldsBooleanSelector

external var isPristine: FormOrFieldsBooleanSelector

external var isValid: BooleanSelector

external var isInvalid: BooleanSelector

external var isSubmitting: BooleanSelector

external var isAsyncValidating: BooleanSelector

external var hasSubmitSucceeded: BooleanSelector

external var hasSubmitFailed: BooleanSelector