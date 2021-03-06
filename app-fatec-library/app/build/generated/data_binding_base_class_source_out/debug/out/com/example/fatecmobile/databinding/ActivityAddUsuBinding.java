// Generated by view binder compiler. Do not edit!
package com.example.fatecmobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.fatecmobile.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddUsuBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btinserir;

  @NonNull
  public final ConstraintLayout linearLayout4;

  @NonNull
  public final EditText login;

  @NonNull
  public final EditText senha;

  @NonNull
  public final EditText status;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final EditText tipo;

  private ActivityAddUsuBinding(@NonNull ConstraintLayout rootView, @NonNull Button btinserir,
      @NonNull ConstraintLayout linearLayout4, @NonNull EditText login, @NonNull EditText senha,
      @NonNull EditText status, @NonNull TextView textView11, @NonNull TextView textView12,
      @NonNull TextView textView13, @NonNull TextView textView14, @NonNull EditText tipo) {
    this.rootView = rootView;
    this.btinserir = btinserir;
    this.linearLayout4 = linearLayout4;
    this.login = login;
    this.senha = senha;
    this.status = status;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.tipo = tipo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddUsuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddUsuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_usu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddUsuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btinserir;
      Button btinserir = rootView.findViewById(id);
      if (btinserir == null) {
        break missingId;
      }

      ConstraintLayout linearLayout4 = (ConstraintLayout) rootView;

      id = R.id.login;
      EditText login = rootView.findViewById(id);
      if (login == null) {
        break missingId;
      }

      id = R.id.senha;
      EditText senha = rootView.findViewById(id);
      if (senha == null) {
        break missingId;
      }

      id = R.id.status;
      EditText status = rootView.findViewById(id);
      if (status == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = rootView.findViewById(id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = rootView.findViewById(id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.tipo;
      EditText tipo = rootView.findViewById(id);
      if (tipo == null) {
        break missingId;
      }

      return new ActivityAddUsuBinding((ConstraintLayout) rootView, btinserir, linearLayout4, login,
          senha, status, textView11, textView12, textView13, textView14, tipo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
