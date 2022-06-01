// Generated by view binder compiler. Do not edit!
package com.example.fatecmobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.fatecmobile.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityListLivrosParamBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btpesquisarLivros;

  @NonNull
  public final ConstraintLayout linearLayout5;

  @NonNull
  public final ListView listamer;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final EditText titulo;

  private ActivityListLivrosParamBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btpesquisarLivros, @NonNull ConstraintLayout linearLayout5,
      @NonNull ListView listamer, @NonNull TextView textView15, @NonNull EditText titulo) {
    this.rootView = rootView;
    this.btpesquisarLivros = btpesquisarLivros;
    this.linearLayout5 = linearLayout5;
    this.listamer = listamer;
    this.textView15 = textView15;
    this.titulo = titulo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityListLivrosParamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityListLivrosParamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_list_livros_param, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityListLivrosParamBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btpesquisarLivros;
      Button btpesquisarLivros = rootView.findViewById(id);
      if (btpesquisarLivros == null) {
        break missingId;
      }

      ConstraintLayout linearLayout5 = (ConstraintLayout) rootView;

      id = R.id.listamer;
      ListView listamer = rootView.findViewById(id);
      if (listamer == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = rootView.findViewById(id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.titulo;
      EditText titulo = rootView.findViewById(id);
      if (titulo == null) {
        break missingId;
      }

      return new ActivityListLivrosParamBinding((ConstraintLayout) rootView, btpesquisarLivros,
          linearLayout5, listamer, textView15, titulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}