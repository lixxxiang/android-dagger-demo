package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface RegistrationComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(registrationActivity: RegistrationActivity)
    fun inject(termsAndConditionsFragment: TermsAndConditionsFragment)
    fun inject(enterDetailsFragment: EnterDetailsFragment)
}